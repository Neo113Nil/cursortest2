package com.netcetera.threeds.sdk.api.info;

import java.util.Date;
import org.bouncycastle.openssl.PEMParser;

/* loaded from: classes5.dex */
public interface CertificateInfo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CertificateType {
        public static final CertificateType CERTIFICATE = new CertificateType(PEMParser.TYPE_CERTIFICATE, 0);
        public static final CertificateType PUBLIC_KEY = new CertificateType("PUBLIC_KEY", 1);
        private static final /* synthetic */ CertificateType[] $VALUES = $values();
        private static int ThreeDS2ServiceInstance = 1;
        private static int get = (ThreeDS2ServiceInstance + 13) % 128;

        private static /* synthetic */ CertificateType[] $values() {
            int i = get;
            CertificateType[] certificateTypeArr = {CERTIFICATE, PUBLIC_KEY};
            int i2 = i + 59;
            ThreeDS2ServiceInstance = i2 % 128;
            if (i2 % 2 != 0) {
                return certificateTypeArr;
            }
            throw null;
        }

        private CertificateType(String str, int i) {
        }

        public static CertificateType valueOf(String str) {
            get = (ThreeDS2ServiceInstance + 91) % 128;
            CertificateType certificateType = (CertificateType) Enum.valueOf(CertificateType.class, str);
            int i = ThreeDS2ServiceInstance + 79;
            get = i % 128;
            if (i % 2 == 0) {
                return certificateType;
            }
            throw null;
        }

        public static CertificateType[] values() {
            int i = ThreeDS2ServiceInstance + 93;
            get = i % 128;
            if (i % 2 == 0) {
                return (CertificateType[]) $VALUES.clone();
            }
            int i2 = 7 / 0;
            return (CertificateType[]) $VALUES.clone();
        }
    }

    String getCertPrefix();

    Date getExpiryDate();

    String getName();

    CertificateType getType();
}
