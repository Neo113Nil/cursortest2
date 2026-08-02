package ru.CryptoPro.JCP.params;

import ru.CryptoPro.JCP.math.BigIntr;
import ru.CryptoPro.JCP.math.EllipticCurve;
import ru.CryptoPro.JCP.math.EllipticPoint;

/* loaded from: classes4.dex */
public interface EllipticConsts2012_512 {
    public static final int RMT_P_tc26_A = -1;
    public static final int RMT_P_tc26_B = 1;
    public static final int RMT_P_tc26_C = -1;
    public static final int[] ECCp_tc26_A = {-569, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] ECCq_tc26_A = {521187957, -892489407, -86853539, -1689569109, 1308975200, 1878141837, -192050927, 669422898, -1, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] ECCa_tc26_A = {-572, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] ECCb_tc26_A = {1517406048, 1345425528, -336705695, -2043741740, 282759389, 1286887232, -217241759, -298012528, -49585563, 2042431516, 1981591784, 884483444, 1718088154, -1044575445, -302217507, -389918627};
    public static final int[] ECCx_tc26_A = {3};
    public static final int[] ECCy_tc26_A = {1377170084, -1985639989, -1036651080, -2144797089, 238698985, 1031136933, 1339045609, -552196418, -873486047, 2004903165, -1393447999, -832693101, -497790746, -1508145130, 2055432931, 1963184104};
    public static final int[] ECCp_tc26_B = {111, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.MIN_VALUE};
    public static final int[] ECCq_tc26_B = {927933885, -969642924, 270264846, -1952880878, -640414470, -1392658565, 627418437, 1235348500, 1, 0, 0, 0, 0, 0, 0, Integer.MIN_VALUE};
    public static final int[] ECCa_tc26_B = {108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.MIN_VALUE};
    public static final int[] ECCb_tc26_B = {-988544746, -74658873, 530780270, 1358400494, -1390758244, 2139826031, -1321112287, 1050041645, 1816864927, -1081746304, 1257322684, -1183023775, 1868440855, 2117994191, -1647820475, 1753029445};
    public static final int[] ECCx_tc26_B = {2};
    public static final int[] ECCy_tc26_B = {-2130820675, 2116105223, -112398612, 671354965, -121620088, 355253418, 517950009, -592303875, -924028107, -1100097050, 1970848275, 1007827817, 1202230287, 738663990, 949684556, 445611738};
    public static final int[] ECCp_tc26_C = {-569, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] ECCq_tc26_C = {1206920173, -1805501201, -1486249690, -923948569, 1363628076, 1278454271, 1694935808, -913515612, -1, -1, -1, -1, -1, -1, -1, 1073741823};
    public static final int[] ECCe_tc26_C = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final int[] ECCd_tc26_C = {871265616, -902812229, -1138089292, -1851732030, -409061730, 81972803, 1364985523, -1498178038, 273695644, -567762846, 428749291, -1421857452, -547619251, 329633596, 25005471, -1638965876};
    public static final int[] ECCu_tc26_C = {18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final int[] ECCv_tc26_C = {1929386557, 1610810350, 1261152999, -1873403200, 328676080, -1090089891, 217549294, 584928101, 2067293845, -1705635457, 395589261, 266318032, 2006982186, 1805211947, 531756513, 1184561053};
    public static final int[] ECCu512_Edw_inv = {954436766, -1908874354, -477218589, 954437176, -1908874354, -477218589, 954437176, -1908874354, -477218589, 954437176, -1908874354, -477218589, 954437176, -1908874354, -477218589, -1193046472};
    public static final int[] ECCv512_Edw_inv = {-651012966, 1792864429, -1786530682, -364246491, -1987700870, -353420373, 218735092, 846258139, 995554542, 2017438489, 1037652312, -195016157, -1609198538, 741641839, -1063622593, -1245962293};

    public static class Elliptic512InstanceHolder {
        public static final EllipticCurve CURVE_tc26_A;
        public static final EllipticCurve CURVE_tc26_B;
        public static final EllipticCurve CURVE_tc26_C;
        public static final EllipticPoint p_tc26_A_store_table;
        public static final EllipticPoint p_tc26_B_store_table;
        public static final EllipticPoint p_tc26_C_store_table;

        static {
            EllipticCurve ellipticCurve = EllipticCurve.getInstance(new BigIntr(EllipticConsts2012_512.ECCa_tc26_A), new BigIntr(EllipticConsts2012_512.ECCb_tc26_A), new BigIntr(EllipticConsts2012_512.ECCp_tc26_A), new BigIntr(EllipticConsts2012_512.ECCq_tc26_A), -1, 0);
            CURVE_tc26_A = ellipticCurve;
            p_tc26_A_store_table = EllipticPoint.getInstance(new BigIntr(EllipticConsts2012_512.ECCx_tc26_A), new BigIntr(EllipticConsts2012_512.ECCy_tc26_A), ellipticCurve).generateTable();
            EllipticCurve ellipticCurve2 = EllipticCurve.getInstance(new BigIntr(EllipticConsts2012_512.ECCa_tc26_B), new BigIntr(EllipticConsts2012_512.ECCb_tc26_B), new BigIntr(EllipticConsts2012_512.ECCp_tc26_B), new BigIntr(EllipticConsts2012_512.ECCq_tc26_B), 1, 0);
            CURVE_tc26_B = ellipticCurve2;
            p_tc26_B_store_table = EllipticPoint.getInstance(new BigIntr(EllipticConsts2012_512.ECCx_tc26_B), new BigIntr(EllipticConsts2012_512.ECCy_tc26_B), ellipticCurve2).generateTable();
            EllipticCurve ellipticCurve3 = EllipticCurve.getInstance(new BigIntr(EllipticConsts2012_512.ECCe_tc26_C), new BigIntr(EllipticConsts2012_512.ECCd_tc26_C), new BigIntr(EllipticConsts2012_512.ECCp_tc26_C), new BigIntr(EllipticConsts2012_512.ECCq_tc26_C), -1, 1);
            CURVE_tc26_C = ellipticCurve3;
            p_tc26_C_store_table = EllipticPoint.getInstanceOfTwistedEdwardsByInverted(new BigIntr(EllipticConsts2012_512.ECCu512_Edw_inv), new BigIntr(EllipticConsts2012_512.ECCv512_Edw_inv), ellipticCurve3).generateTable();
        }
    }
}
