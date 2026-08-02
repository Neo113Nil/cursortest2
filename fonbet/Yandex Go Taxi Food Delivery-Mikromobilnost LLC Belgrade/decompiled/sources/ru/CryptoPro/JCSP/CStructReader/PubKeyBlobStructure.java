package ru.CryptoPro.JCSP.CStructReader;

import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1DerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import ru.CryptoPro.JCP.ASN.GostR3410_2001_PKISyntax.GostR3410_2001_PublicKeyParameters;
import ru.CryptoPro.JCP.ASN.GostR3410_2012_PKISyntax.GostR3410_2012_PublicKeyParameters;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.RsaModulus;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.RsaPubKey;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.EllipticParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class PubKeyBlobStructure extends AbstractStructReader {
    public static final String WRONG_OPEN_KEY_BLOB = "Wrong OpenKeyBlob: ";
    private boolean a;
    private boolean b;
    public Asn1ObjectIdentifier ecdsaOID;
    public PubKeyInfoHeaderStructure header;
    public CPseudoArray openKey;
    public GostR3410_2001_PublicKeyParameters params01;
    public GostR3410_2012_PublicKeyParameters params12;
    public RsaPubKey rsaPubKey;

    public PubKeyBlobStructure(int i, RsaPubKey rsaPubKey) {
        this.header = null;
        this.openKey = null;
        this.params01 = null;
        this.params12 = null;
        this.ecdsaOID = null;
        this.rsaPubKey = null;
        this.a = false;
        this.b = false;
        int bitLength = rsaPubKey.modulus.value.bitLength();
        byte[] byteArray = rsaPubKey.modulus.value.toByteArray();
        int length = byteArray.length;
        int i2 = ((bitLength + 7) >> 3) << 3;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 0, bArr, 0, length);
        if (bArr[0] == 0) {
            int i3 = length - 1;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 1, bArr2, 0, i3);
            bArr = bArr2;
        }
        this.header = new PubKeyInfoHeaderStructure((byte) 6, (short) 0, i, i2, 24);
        this.openKey = new CPseudoArray(bArr);
        this.rsaPubKey = rsaPubKey;
        this.b = true;
    }

    private void a(OutputStream outputStream) throws StructException {
        Asn1Type asn1Type;
        GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters;
        Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
        try {
            int i = this.header.blobHeader.aiKeyAlg.value;
            if (i != 8707) {
                if (i == 11806 || i == 11811) {
                    asn1Type = this.params01;
                    asn1Type.encode(asn1DerEncodeBuffer);
                    asn1DerEncodeBuffer.write(outputStream);
                }
                if (i == 11837 || i == 11849) {
                    OID oid = new OID(this.params12.publicKeyParamSet.value);
                    OID oid2 = null;
                    if (EllipticParamsSpec.isShortNewOID(oid)) {
                        gostR3410_2012_PublicKeyParameters = new GostR3410_2012_PublicKeyParameters(this.params12.publicKeyParamSet, (Asn1ObjectIdentifier) null, (Asn1ObjectIdentifier) null);
                    } else {
                        if (!EllipticParamsSpec.is256OID_A(oid) && this.header.blobHeader.aiKeyAlg.value != 11837) {
                            GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters2 = this.params12;
                            gostR3410_2012_PublicKeyParameters = new GostR3410_2012_PublicKeyParameters(gostR3410_2012_PublicKeyParameters2.publicKeyParamSet, gostR3410_2012_PublicKeyParameters2.digestParamSet, gostR3410_2012_PublicKeyParameters2.encryptionParamSet);
                        }
                        Asn1ObjectIdentifier asn1ObjectIdentifier = this.params12.encryptionParamSet;
                        if (asn1ObjectIdentifier != null) {
                            oid2 = new OID(asn1ObjectIdentifier.value);
                        }
                        if (oid2 == null) {
                            oid2 = CryptParamsSpec.OID_Gost28147_89_Rosstandart_TC26_Z_ParamSet;
                        }
                        GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters3 = this.params12;
                        gostR3410_2012_PublicKeyParameters = new GostR3410_2012_PublicKeyParameters(gostR3410_2012_PublicKeyParameters3.publicKeyParamSet, gostR3410_2012_PublicKeyParameters3.digestParamSet, new Asn1ObjectIdentifier(oid2.value));
                    }
                    gostR3410_2012_PublicKeyParameters.encode(asn1DerEncodeBuffer);
                } else if (i != 43525) {
                }
                asn1DerEncodeBuffer.write(outputStream);
            }
            asn1Type = this.ecdsaOID;
            asn1Type.encode(asn1DerEncodeBuffer);
            asn1DerEncodeBuffer.write(outputStream);
        } catch (Asn1Exception e) {
            throw new StructException("Wrong OpenKeyBlob: ".concat(e.getMessage()));
        } catch (IOException e2) {
            throw new StructException("Wrong OpenKeyBlob: ".concat(e2.getMessage()));
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.header.clear();
        this.params01 = new GostR3410_2001_PublicKeyParameters();
        this.params12 = new GostR3410_2012_PublicKeyParameters();
        this.ecdsaOID = new Asn1ObjectIdentifier();
        this.openKey.clear();
        this.rsaPubKey = new RsaPubKey();
        this.a = false;
        this.b = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.header.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        this.header.read(inputStream);
        a(inputStream);
        int i = this.header.keyParam.bitLen.value >> 3;
        this.openKey.setLength(i);
        int i2 = this.header.blobHeader.aiKeyAlg.value;
        if (i2 == 41984 || i2 == 9216) {
            try {
                int available = inputStream.available() - i;
                CPseudoArray cPseudoArray = new CPseudoArray();
                cPseudoArray.setLength(available);
                cPseudoArray.read(inputStream);
                long j = Array.getInt(cPseudoArray.value, 0);
                this.openKey.read(inputStream);
                this.openKey.inverse();
                byte[] bArr = this.openKey.value;
                byte[] bArr2 = new byte[bArr.length + 1];
                System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
                this.rsaPubKey = new RsaPubKey(new RsaModulus(new BigInteger(bArr2)), new Asn1Integer(j));
            } catch (IOException e) {
                dy31.o(e);
                return;
            }
        } else {
            this.openKey.read(inputStream);
        }
        try {
            if (inputStream.available() == 0) {
                this.a = true;
            }
            if (this.header.blobHeader.bType.value != 6) {
                throw new StructException("Wrong OpenKeyBlob: ".concat("Wrong type"));
            }
            this.b = true;
        } catch (IOException e2) {
            dy31.o(e2);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.header.setAligned(i);
        this.openKey.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        CPseudoArray cPseudoArray;
        if (this.b) {
            this.header.write(outputStream);
            a(outputStream);
            int i = this.header.blobHeader.aiKeyAlg.value;
            if (i == 41984 || i == 9216) {
                new CPseudoArray(Array.toByteArray((int) this.rsaPubKey.pubexp.value)).write(outputStream);
                byte[] bArr = this.openKey.value;
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                Array.invByteOrder(bArr2);
                cPseudoArray = new CPseudoArray(bArr2);
            } else {
                cPseudoArray = this.openKey;
            }
            cPseudoArray.write(outputStream);
        }
    }

    public PubKeyBlobStructure(int i, Asn1ObjectIdentifier asn1ObjectIdentifier, byte[] bArr) {
        this.header = null;
        this.openKey = null;
        this.params01 = null;
        this.params12 = null;
        this.ecdsaOID = null;
        this.rsaPubKey = null;
        this.a = false;
        this.b = false;
        this.header = new PubKeyInfoHeaderStructure((byte) 6, (short) 1, i, bArr.length << 3, 0);
        this.ecdsaOID = asn1ObjectIdentifier;
        this.openKey = new CPseudoArray(bArr);
        this.b = true;
    }

    public PubKeyBlobStructure(int i, GostR3410_2001_PublicKeyParameters gostR3410_2001_PublicKeyParameters, byte[] bArr) {
        this.header = null;
        this.openKey = null;
        this.params01 = null;
        this.params12 = null;
        this.ecdsaOID = null;
        this.rsaPubKey = null;
        this.a = false;
        this.b = false;
        this.header = new PubKeyInfoHeaderStructure((byte) 6, (short) 1, i, bArr.length << 3, 0);
        this.params01 = gostR3410_2001_PublicKeyParameters;
        this.openKey = new CPseudoArray(bArr);
        this.b = true;
    }

    public PubKeyBlobStructure(int i, GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters, byte[] bArr) {
        this.header = null;
        this.openKey = null;
        this.params01 = null;
        this.params12 = null;
        this.ecdsaOID = null;
        this.rsaPubKey = null;
        this.a = false;
        this.b = false;
        this.header = new PubKeyInfoHeaderStructure((byte) 6, (short) 1, i, bArr.length << 3, 0);
        this.params12 = gostR3410_2012_PublicKeyParameters;
        this.openKey = new CPseudoArray(bArr);
        this.b = true;
    }

    public PubKeyBlobStructure() {
        this.header = null;
        this.openKey = null;
        this.params01 = null;
        this.params12 = null;
        this.ecdsaOID = null;
        this.rsaPubKey = null;
        this.a = false;
        this.b = false;
        this.header = new PubKeyInfoHeaderStructure();
        this.params01 = new GostR3410_2001_PublicKeyParameters();
        this.params12 = new GostR3410_2012_PublicKeyParameters();
        this.ecdsaOID = new Asn1ObjectIdentifier();
        this.openKey = new CPseudoArray();
    }

    public PubKeyBlobStructure(int i, byte[] bArr) {
        this.header = null;
        this.openKey = null;
        this.params01 = null;
        this.params12 = null;
        this.ecdsaOID = null;
        this.rsaPubKey = null;
        this.a = false;
        this.b = false;
        this.header = new PubKeyInfoHeaderStructure((byte) 6, (short) 1, i, bArr.length << 3, 32);
        this.openKey = new CPseudoArray(bArr);
        this.b = true;
    }

    private void a(InputStream inputStream) throws StructException {
        Asn1Type asn1Type;
        Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(inputStream);
        try {
            int i = this.header.blobHeader.aiKeyAlg.value;
            if (i != 8707) {
                if (i == 11806 || i == 11811) {
                    asn1Type = this.params01;
                } else if (i == 11837 || i == 11849) {
                    asn1Type = this.params12;
                } else if (i != 43525) {
                    return;
                }
                asn1Type.decode(asn1DerDecodeBuffer);
            }
            asn1Type = this.ecdsaOID;
            asn1Type.decode(asn1DerDecodeBuffer);
        } catch (Asn1Exception e) {
            throw new StructException("Wrong OpenKeyBlob: ".concat(e.getMessage()));
        } catch (IOException e2) {
            throw new StructException("Wrong OpenKeyBlob: ".concat(e2.getMessage()));
        }
    }
}
