package ru.CryptoPro.JCP.tools.CertReader;

import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1CharString;
import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import com.objsys.asn1j.runtime.Asn1IA5String;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Null;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1PrintableString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1UTCTime;
import com.objsys.asn1j.runtime.Asn1UTF8String;
import com.objsys.asn1j.runtime.Asn1UniversalString;
import defpackage.yci0;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.Vector;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class UnknownOIDProcessor extends ExtensionProcessor {
    public String b;

    public static Vector a(Asn1DerDecodeBuffer asn1DerDecodeBuffer) {
        Extension extension;
        Extension extension2;
        Vector vector = new Vector(0);
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1DerDecodeBuffer, asn1DerDecodeBuffer.decodeTagAndLength(asn1DerDecodeBuffer.peekTag()));
        while (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1DerDecodeBuffer.peekTag();
            int i = peekTag.mIDCode;
            if (i == 1) {
                Asn1Boolean asn1Boolean = new Asn1Boolean();
                asn1Boolean.decode(asn1DerDecodeBuffer);
                extension = new Extension(asn1Boolean.toString());
            } else if (i == 2) {
                Asn1Integer asn1Integer = new Asn1Integer();
                asn1Integer.decode(asn1DerDecodeBuffer);
                extension = new Extension(asn1Integer.toString());
            } else if (i != 5) {
                if (i == 6) {
                    Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
                    asn1ObjectIdentifier.decode(asn1DerDecodeBuffer);
                    StringBuffer stringBuffer = new StringBuffer();
                    int i2 = 0;
                    for (int i3 : asn1ObjectIdentifier.value) {
                        if (i2 != 0) {
                            stringBuffer.append(Extension.DOT_CHAR);
                        }
                        stringBuffer.append(i3);
                        i2++;
                    }
                    extension2 = new Extension(stringBuffer.toString());
                } else if (i == 12) {
                    Asn1UTF8String asn1UTF8String = new Asn1UTF8String();
                    asn1UTF8String.decode(asn1DerDecodeBuffer);
                    extension = new Extension(asn1UTF8String.toString());
                } else if (i == 16) {
                    extension2 = new Extension("", a(asn1DerDecodeBuffer));
                } else if (i == 19) {
                    Asn1PrintableString asn1PrintableString = new Asn1PrintableString();
                    asn1PrintableString.decode(asn1DerDecodeBuffer);
                    extension = new Extension(asn1PrintableString.toString());
                } else if (i != 28) {
                    switch (i) {
                        case 22:
                            Asn1IA5String asn1IA5String = new Asn1IA5String();
                            asn1IA5String.decode(asn1DerDecodeBuffer);
                            extension = new Extension(asn1IA5String.toString());
                            break;
                        case 23:
                            Asn1UTCTime asn1UTCTime = new Asn1UTCTime();
                            asn1UTCTime.decode(asn1DerDecodeBuffer);
                            extension = new Extension(asn1UTCTime.toString());
                            break;
                        case 24:
                            Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime();
                            asn1GeneralizedTime.decode(asn1DerDecodeBuffer);
                            extension = new Extension(asn1GeneralizedTime.toString());
                            break;
                        default:
                            yci0.s(peekTag.mIDCode, "Unsupported encoded data type: ");
                            return null;
                    }
                } else {
                    Asn1UniversalString asn1UniversalString = new Asn1UniversalString();
                    asn1UniversalString.decode(asn1DerDecodeBuffer);
                    extension = new Extension(asn1UniversalString.toString());
                }
                vector.add(extension2);
            } else {
                Asn1Null asn1Null = new Asn1Null();
                asn1Null.decode(asn1DerDecodeBuffer);
                extension = new Extension(asn1Null.toString());
            }
            vector.add(extension);
        }
        return vector;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final Extension getExtension(X509Certificate x509Certificate) {
        String str;
        Asn1CharString asn1UTF8String;
        byte[] extensionValue = x509Certificate.getExtensionValue(this.b);
        if (extensionValue != null) {
            Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(extensionValue);
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            try {
                asn1OctetString.decode(asn1DerDecodeBuffer);
                Asn1DerDecodeBuffer asn1DerDecodeBuffer2 = new Asn1DerDecodeBuffer(asn1OctetString.value);
                Asn1Tag peekTag = asn1DerDecodeBuffer2.peekTag();
                int i = peekTag.mIDCode;
                if (i == 1) {
                    Asn1Boolean asn1Boolean = new Asn1Boolean();
                    asn1Boolean.decode(asn1DerDecodeBuffer2);
                    str = asn1Boolean.toString();
                } else if (i == 2) {
                    Asn1Integer asn1Integer = new Asn1Integer();
                    asn1Integer.decode(asn1DerDecodeBuffer2);
                    str = asn1Integer.toString();
                } else if (i == 5) {
                    Asn1Null asn1Null = new Asn1Null();
                    asn1Null.decode(asn1DerDecodeBuffer2);
                    str = asn1Null.toString();
                } else if (i != 6) {
                    if (i == 12) {
                        asn1UTF8String = new Asn1UTF8String();
                    } else {
                        if (i == 16) {
                            return new Extension(getName(), a(asn1DerDecodeBuffer2));
                        }
                        if (i == 19) {
                            asn1UTF8String = new Asn1PrintableString();
                        } else if (i != 28) {
                            switch (i) {
                                case 22:
                                    asn1UTF8String = new Asn1IA5String();
                                    break;
                                case 23:
                                    asn1UTF8String = new Asn1UTCTime();
                                    break;
                                case 24:
                                    asn1UTF8String = new Asn1GeneralizedTime();
                                    break;
                                default:
                                    throw new IOException("Unsupported encoded data type: " + peekTag.mIDCode);
                            }
                        } else {
                            Asn1UniversalString asn1UniversalString = new Asn1UniversalString();
                            asn1UniversalString.decode(asn1DerDecodeBuffer2);
                            str = asn1UniversalString.toString();
                        }
                    }
                    asn1UTF8String.decode(asn1DerDecodeBuffer2);
                    str = asn1UTF8String.toString();
                } else {
                    Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
                    asn1ObjectIdentifier.decode(asn1DerDecodeBuffer2);
                    StringBuffer stringBuffer = new StringBuffer();
                    int i2 = 0;
                    for (int i3 : asn1ObjectIdentifier.value) {
                        if (i2 != 0) {
                            stringBuffer.append(Extension.DOT_CHAR);
                        }
                        stringBuffer.append(i3);
                        i2++;
                    }
                    str = stringBuffer.toString();
                }
            } catch (Asn1Exception | IOException unused) {
                str = Array.toHexLowString(extensionValue);
            }
        } else {
            str = "";
        }
        return new Extension(getName(), new Extension(str));
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final String getOID() {
        return this.b;
    }
}
