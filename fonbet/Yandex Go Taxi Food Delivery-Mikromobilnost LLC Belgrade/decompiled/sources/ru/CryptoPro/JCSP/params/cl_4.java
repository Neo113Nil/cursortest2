package ru.CryptoPro.JCSP.params;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import ru.CryptoPro.JCP.params.KdfTreeDiversKeySpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CStructReader.CryptDiversBlobStructure;
import ru.CryptoPro.JCSP.CStructReader.CryptKdfTreeDiversBlobStructure;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class cl_4 {
    public static byte[] a(int i, KdfTreeDiversKeySpec kdfTreeDiversKeySpec) throws InvalidKeySpecException {
        if (i == 0) {
            return new byte[0];
        }
        byte[] seed = kdfTreeDiversKeySpec.getSeed();
        byte[] label = kdfTreeDiversKeySpec.getLabel();
        int length = seed.length;
        int length2 = label.length;
        byte[] bArr = new byte[length + length2];
        if (length > 0) {
            Array.copy(seed, 0, bArr, 0, length);
        }
        if (length2 > 0) {
            Array.copy(label, 0, bArr, length, length2);
        }
        CryptKdfTreeDiversBlobStructure cryptKdfTreeDiversBlobStructure = new CryptKdfTreeDiversBlobStructure(i, HProv.CALG_KDF_TREE_GOSTR3411_2012_256, kdfTreeDiversKeySpec.getIterationNumber(), kdfTreeDiversKeySpec.getL(), kdfTreeDiversKeySpec.getR(), length, length2, bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                cryptKdfTreeDiversBlobStructure.write(byteArrayOutputStream);
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (StructException e) {
            throw new InvalidKeySpecException(e);
        }
    }

    public static byte[] a(ru.CryptoPro.JCP.params.DiversKeySpec diversKeySpec) throws InvalidKeySpecException {
        int i;
        int diversType = diversKeySpec.getDiversType();
        if (diversType == 1) {
            i = HProv.CALG_PRO_DIVERS;
        } else {
            if (diversType != 2) {
                throw new InvalidKeySpecException("Unknown diversification type: " + diversKeySpec.getDiversType());
            }
            i = HProv.CALG_PRO12_DIVERS;
        }
        CryptDiversBlobStructure cryptDiversBlobStructure = new CryptDiversBlobStructure(i, diversKeySpec.getBlob(), diversKeySpec.getMagic());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                cryptDiversBlobStructure.write(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
            }
        } catch (Exception e) {
            throw new InvalidKeySpecException(e);
        }
    }
}
