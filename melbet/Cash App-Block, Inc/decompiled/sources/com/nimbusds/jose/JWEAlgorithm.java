package com.nimbusds.jose;

/* loaded from: classes5.dex */
public final class JWEAlgorithm extends Algorithm {
    public static final JWEAlgorithm RSA1_5 = new JWEAlgorithm("RSA1_5");
    public static final JWEAlgorithm RSA_OAEP = new JWEAlgorithm("RSA-OAEP");
    public static final JWEAlgorithm RSA_OAEP_256 = new JWEAlgorithm("RSA-OAEP-256");
    public static final JWEAlgorithm RSA_OAEP_384 = new JWEAlgorithm("RSA-OAEP-384");
    public static final JWEAlgorithm RSA_OAEP_512 = new JWEAlgorithm("RSA-OAEP-512");
    public static final JWEAlgorithm A128KW = new JWEAlgorithm("A128KW");
    public static final JWEAlgorithm A192KW = new JWEAlgorithm("A192KW");
    public static final JWEAlgorithm A256KW = new JWEAlgorithm("A256KW");
    public static final JWEAlgorithm DIR = new JWEAlgorithm("dir");
    public static final JWEAlgorithm ECDH_ES = new JWEAlgorithm("ECDH-ES");
    public static final JWEAlgorithm ECDH_ES_A128KW = new JWEAlgorithm("ECDH-ES+A128KW");
    public static final JWEAlgorithm ECDH_ES_A192KW = new JWEAlgorithm("ECDH-ES+A192KW");
    public static final JWEAlgorithm ECDH_ES_A256KW = new JWEAlgorithm("ECDH-ES+A256KW");
    public static final JWEAlgorithm ECDH_1PU = new JWEAlgorithm("ECDH-1PU");
    public static final JWEAlgorithm ECDH_1PU_A128KW = new JWEAlgorithm("ECDH-1PU+A128KW");
    public static final JWEAlgorithm ECDH_1PU_A192KW = new JWEAlgorithm("ECDH-1PU+A192KW");
    public static final JWEAlgorithm ECDH_1PU_A256KW = new JWEAlgorithm("ECDH-1PU+A256KW");
    public static final JWEAlgorithm A128GCMKW = new JWEAlgorithm("A128GCMKW");
    public static final JWEAlgorithm A192GCMKW = new JWEAlgorithm("A192GCMKW");
    public static final JWEAlgorithm A256GCMKW = new JWEAlgorithm("A256GCMKW");
    public static final JWEAlgorithm PBES2_HS256_A128KW = new JWEAlgorithm("PBES2-HS256+A128KW");
    public static final JWEAlgorithm PBES2_HS384_A192KW = new JWEAlgorithm("PBES2-HS384+A192KW");
    public static final JWEAlgorithm PBES2_HS512_A256KW = new JWEAlgorithm("PBES2-HS512+A256KW");

    public static JWEAlgorithm parse(String str) {
        JWEAlgorithm jWEAlgorithm = RSA1_5;
        if (str.equals(jWEAlgorithm.name)) {
            return jWEAlgorithm;
        }
        JWEAlgorithm jWEAlgorithm2 = RSA_OAEP;
        if (str.equals(jWEAlgorithm2.name)) {
            return jWEAlgorithm2;
        }
        JWEAlgorithm jWEAlgorithm3 = RSA_OAEP_256;
        if (str.equals(jWEAlgorithm3.name)) {
            return jWEAlgorithm3;
        }
        JWEAlgorithm jWEAlgorithm4 = RSA_OAEP_384;
        if (str.equals(jWEAlgorithm4.name)) {
            return jWEAlgorithm4;
        }
        JWEAlgorithm jWEAlgorithm5 = RSA_OAEP_512;
        if (str.equals(jWEAlgorithm5.name)) {
            return jWEAlgorithm5;
        }
        JWEAlgorithm jWEAlgorithm6 = A128KW;
        if (str.equals(jWEAlgorithm6.name)) {
            return jWEAlgorithm6;
        }
        JWEAlgorithm jWEAlgorithm7 = A192KW;
        if (str.equals(jWEAlgorithm7.name)) {
            return jWEAlgorithm7;
        }
        JWEAlgorithm jWEAlgorithm8 = A256KW;
        if (str.equals(jWEAlgorithm8.name)) {
            return jWEAlgorithm8;
        }
        JWEAlgorithm jWEAlgorithm9 = DIR;
        if (str.equals(jWEAlgorithm9.name)) {
            return jWEAlgorithm9;
        }
        JWEAlgorithm jWEAlgorithm10 = ECDH_ES;
        if (str.equals(jWEAlgorithm10.name)) {
            return jWEAlgorithm10;
        }
        JWEAlgorithm jWEAlgorithm11 = ECDH_ES_A128KW;
        if (str.equals(jWEAlgorithm11.name)) {
            return jWEAlgorithm11;
        }
        JWEAlgorithm jWEAlgorithm12 = ECDH_ES_A192KW;
        if (str.equals(jWEAlgorithm12.name)) {
            return jWEAlgorithm12;
        }
        JWEAlgorithm jWEAlgorithm13 = ECDH_ES_A256KW;
        if (str.equals(jWEAlgorithm13.name)) {
            return jWEAlgorithm13;
        }
        JWEAlgorithm jWEAlgorithm14 = ECDH_1PU;
        if (str.equals(jWEAlgorithm14.name)) {
            return jWEAlgorithm14;
        }
        JWEAlgorithm jWEAlgorithm15 = ECDH_1PU_A128KW;
        if (str.equals(jWEAlgorithm15.name)) {
            return jWEAlgorithm15;
        }
        JWEAlgorithm jWEAlgorithm16 = ECDH_1PU_A192KW;
        if (str.equals(jWEAlgorithm16.name)) {
            return jWEAlgorithm16;
        }
        JWEAlgorithm jWEAlgorithm17 = ECDH_1PU_A256KW;
        if (str.equals(jWEAlgorithm17.name)) {
            return jWEAlgorithm17;
        }
        JWEAlgorithm jWEAlgorithm18 = A128GCMKW;
        if (str.equals(jWEAlgorithm18.name)) {
            return jWEAlgorithm18;
        }
        JWEAlgorithm jWEAlgorithm19 = A192GCMKW;
        if (str.equals(jWEAlgorithm19.name)) {
            return jWEAlgorithm19;
        }
        JWEAlgorithm jWEAlgorithm20 = A256GCMKW;
        if (str.equals(jWEAlgorithm20.name)) {
            return jWEAlgorithm20;
        }
        JWEAlgorithm jWEAlgorithm21 = PBES2_HS256_A128KW;
        if (str.equals(jWEAlgorithm21.name)) {
            return jWEAlgorithm21;
        }
        JWEAlgorithm jWEAlgorithm22 = PBES2_HS384_A192KW;
        if (str.equals(jWEAlgorithm22.name)) {
            return jWEAlgorithm22;
        }
        JWEAlgorithm jWEAlgorithm23 = PBES2_HS512_A256KW;
        return str.equals(jWEAlgorithm23.name) ? jWEAlgorithm23 : new JWEAlgorithm(str);
    }
}
