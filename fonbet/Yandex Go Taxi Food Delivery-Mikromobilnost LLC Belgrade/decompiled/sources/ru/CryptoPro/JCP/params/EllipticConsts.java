package ru.CryptoPro.JCP.params;

import ru.CryptoPro.JCP.math.BigIntr;
import ru.CryptoPro.JCP.math.EllipticCurve;
import ru.CryptoPro.JCP.math.EllipticPoint;

/* loaded from: classes4.dex */
public interface EllipticConsts {
    public static final int RMT_P_CRYPTOPRO = -1;
    public static final int RMT_P_DESIMAL = 1;
    public static final int RMT_P_EDW256 = -1;
    public static final int RMT_P_OSCAR = 1;
    public static final int RMT_P_PROVAR1 = 2;
    public static final int[] ECCp_CryptoPRO = {-617, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] ECCq_CryptoPRO = {-1218332525, 1166285577, -1722101504, 1818300528, -1, -1, -1, -1};
    public static final int[] ECCa_CryptoPRO = {-620, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] ECCb_CryptoPRO = {166, 0, 0, 0, 0, 0, 0, 0};
    public static final int[] ECCx_CryptoPRO = {1};
    public static final int[] ECCy_CryptoPRO = {-1633739244, 581749148, -551296079, 891899693, 1161767798, 668946522, -526869286, -1919818639};
    public static final int[] ECCp_OSCAR = {3225, 0, 0, 0, 0, 0, 0, Integer.MIN_VALUE};
    public static final int[] ECCq_OSCAR = {-863364721, -459860453, -240769819, 1601178879, 1, 0, 0, Integer.MIN_VALUE};
    public static final int[] ECCa_OSCAR = {3222, 0, 0, 0, 0, 0, 0, Integer.MIN_VALUE};
    public static final int[] ECCb_OSCAR = {2115746955, 793367758, 1946102552, -377936493, 1547565066, 1722274754, -1570134536, 1041953817};
    public static final int[] ECCx_OSCAR = {1};
    public static final int[] ECCy_OSCAR = {393314044, 1951135959, -1929122565, -985282171, -1296011035, -1203954626, 1509516928, 1067979331};
    public static final int[] ECCp_PROvar1 = {36533659, 2040068025, 2022724051, -813404538, 1799473322, -1424045986, 1518698759, -1684053921};
    public static final int[] ECCq_PROvar1 = {-1734865991, -265340315, 517864308, 1479320401, 1799473322, -1424045986, 1518698759, -1684053921};
    public static final int[] ECCa_PROvar1 = {36533656, 2040068025, 2022724051, -813404538, 1799473322, -1424045986, 1518698759, -1684053921};
    public static final int[] ECCb_PROvar1 = {32858, 0, 0, 0, 0, 0, 0, 0};
    public static final int[] ECCx_PROvar1 = {0};
    public static final int[] ECCy_PROvar1 = {-38552729, 913200397, -731637105, 1296942144, -855064338, 1019164547, 1131485836, 1106044247};
    public static final int[] ECCp_desimal = {1073, 0, 0, 0, 0, 0, 0, Integer.MIN_VALUE};
    public static final int[] ECCq_desimal = {986510771, -979567591, -1835572908, 1358858776, 1, 0, 0, Integer.MIN_VALUE};
    public static final int[] ECCa_desimal = {7, 0, 0, 0, 0, 0, 0, 0};
    public static final int[] ECCb_desimal = {-622707842, 1363938537, 879950890, 1446997610, -72356032, 968417314, -1433170713, 1606415512};
    public static final int[] ECCx_desimal = {2};
    public static final int[] ECCy_desimal = {-360804408, 731294652, -1667078382, -2050392310, 236376476, -1117579773, -430880812, 149072032};
    public static final int[] ECCp256_Edw = {-617, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] ECCq256_Edw = {1815481447, -1055543467, -931437003, 265866719, 0, 0, 0, 1073741824};
    public static final int[] ECCu256_Edw = {13, 0, 0, 0, 0, 0, 0, 0};
    public static final int[] ECCv256_Edw = {-610074393, -114612846, -2014171519, -403731010, -1425578852, -2071411825, -1438164172, 1623858738};
    public static final int[] ECCd256_Edw = {1841807355, -450706643, -1761568009, 731772456, -86697965, 1468777372, -1048315263, 101054135};
    public static final int[] ECCe256_Edw = {1, 0, 0, 0, 0, 0, 0, 0};
    public static final int[] ECCu256_Edw_inv = {991145872, -1321528399, 330382099, 991146299, -1321528399, 330382099, 991146299, -1321528399};
    public static final int[] ECCv256_Edw_inv = {1986324636, 2008720233, -688662972, 1498882383, 428771049, 594598281, 1682858546, 1577852300};

    public static class EllipticInstanceHolder {
        public static final EllipticCurve CURVE_CryptoPRO;
        public static final EllipticCurve CURVE_Edw256;
        public static final EllipticCurve CURVE_OSCAR;
        public static final EllipticCurve CURVE_PROvar1;
        public static final EllipticCurve CURVE_desimal;
        public static final EllipticPoint p_CryptoPRO_store_table;
        public static final EllipticPoint p_Edw256_store_table;
        public static final EllipticPoint p_OSCAR_store_table;
        public static final EllipticPoint p_PROvar1_store_table;
        public static final EllipticPoint p_desimal_store_table;

        static {
            EllipticCurve ellipticCurve = EllipticCurve.getInstance(new BigIntr(EllipticConsts.ECCa_desimal), new BigIntr(EllipticConsts.ECCb_desimal), new BigIntr(EllipticConsts.ECCp_desimal), new BigIntr(EllipticConsts.ECCq_desimal), 1, 0);
            CURVE_desimal = ellipticCurve;
            p_desimal_store_table = EllipticPoint.getInstance(new BigIntr(EllipticConsts.ECCx_desimal), new BigIntr(EllipticConsts.ECCy_desimal), ellipticCurve).generateTable();
            EllipticCurve ellipticCurve2 = EllipticCurve.getInstance(new BigIntr(EllipticConsts.ECCa_CryptoPRO), new BigIntr(EllipticConsts.ECCb_CryptoPRO), new BigIntr(EllipticConsts.ECCp_CryptoPRO), new BigIntr(EllipticConsts.ECCq_CryptoPRO), -1, 0);
            CURVE_CryptoPRO = ellipticCurve2;
            p_CryptoPRO_store_table = EllipticPoint.getInstance(new BigIntr(EllipticConsts.ECCx_CryptoPRO), new BigIntr(EllipticConsts.ECCy_CryptoPRO), ellipticCurve2).generateTable();
            EllipticCurve ellipticCurve3 = EllipticCurve.getInstance(new BigIntr(EllipticConsts.ECCa_PROvar1), new BigIntr(EllipticConsts.ECCb_PROvar1), new BigIntr(EllipticConsts.ECCp_PROvar1), new BigIntr(EllipticConsts.ECCq_PROvar1), 2, 0);
            CURVE_PROvar1 = ellipticCurve3;
            p_PROvar1_store_table = EllipticPoint.getInstance(new BigIntr(EllipticConsts.ECCx_PROvar1), new BigIntr(EllipticConsts.ECCy_PROvar1), ellipticCurve3).generateTable();
            EllipticCurve ellipticCurve4 = EllipticCurve.getInstance(new BigIntr(EllipticConsts.ECCa_OSCAR), new BigIntr(EllipticConsts.ECCb_OSCAR), new BigIntr(EllipticConsts.ECCp_OSCAR), new BigIntr(EllipticConsts.ECCq_OSCAR), 1, 0);
            CURVE_OSCAR = ellipticCurve4;
            p_OSCAR_store_table = EllipticPoint.getInstance(new BigIntr(EllipticConsts.ECCx_OSCAR), new BigIntr(EllipticConsts.ECCy_OSCAR), ellipticCurve4).generateTable();
            EllipticCurve ellipticCurve5 = EllipticCurve.getInstance(new BigIntr(EllipticConsts.ECCe256_Edw), new BigIntr(EllipticConsts.ECCd256_Edw), new BigIntr(EllipticConsts.ECCp256_Edw), new BigIntr(EllipticConsts.ECCq256_Edw), -1, 1);
            CURVE_Edw256 = ellipticCurve5;
            p_Edw256_store_table = EllipticPoint.getInstanceOfTwistedEdwardsByInverted(new BigIntr(EllipticConsts.ECCu256_Edw_inv), new BigIntr(EllipticConsts.ECCv256_Edw_inv), ellipticCurve5).generateTable();
        }
    }
}
