package defpackage;

/* loaded from: classes5.dex */
public final class sxf implements kse {
    public static final sxf b = new sxf(0);
    public static final sxf c = new sxf(1);
    public static final sxf d = new sxf(2);
    public static final sxf e = new sxf(3);
    public static final sxf f = new sxf(4);
    public static final sxf g = new sxf(5);
    public static final sxf h = new sxf(6);
    public static final sxf i = new sxf(7);
    public static final sxf j = new sxf(8);
    public static final sxf k = new sxf(9);
    public static final sxf l = new sxf(10);
    public final /* synthetic */ int a;

    public /* synthetic */ sxf(int i2) {
        this.a = i2;
    }

    @Override // defpackage.kse
    public final boolean a(int i2) {
        switch (this.a) {
            case 0:
                if (txf.b(i2) != null) {
                }
                break;
            case 1:
                if ((i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : szr.STATE_EXPIRED : szr.STATE_SNOOZED : szr.STATE_OFF : szr.STATE_ON) != null) {
                }
                break;
            case 2:
                if ((i2 != 0 ? i2 != 1 ? i2 != 3 ? null : tzr.NO_SERVER_SIDE_FILTER_REQUIRED_FOR_SYSTEM_APPS : tzr.SERVER_SIDE_FILTER_REQUIRED : tzr.SERVER_SIDE_FILTER_UNSPECIFIED) != null) {
                }
                break;
            case 3:
                if (uzr.b(i2) != null) {
                }
                break;
            case 4:
                if ((i2 != 0 ? i2 != 1 ? i2 != 2 ? null : wzr.SAMPLING_NOT_APPLIED : wzr.SAMPLING_APPLIED : wzr.SAMPLING_UNKNOWN) != null) {
                }
                break;
            case 5:
                if (xzr.b(i2) != null) {
                }
                break;
            case 6:
                if ((i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : yzr.HAS_OFFSTORE : yzr.NO_OFFSTORE_UNVERIFIED : yzr.NO_OFFSTORE_VERIFIED : yzr.NO_EXTENSIONS) != null) {
                }
                break;
            case 7:
                if ((i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : a0s.INSTALLER_PACKAGE_OTHER : a0s.INSTALLER_PACKAGE_GOOGLE_PLAY_STORE : a0s.INSTALLER_PACKAGE_NONE : a0s.INSTALLER_PACKAGE_UNKNOWN) != null) {
                }
                break;
            case 8:
                if ((i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : b0s.LTS_CHANNEL_LTS : b0s.LTS_CHANNEL_LTC : b0s.LTS_CHANNEL_STABLE : b0s.LTS_CHANNEL_UNKNOWN) != null) {
                }
                break;
            case 9:
                if ((i2 != 0 ? i2 != 1 ? i2 != 2 ? null : c0s.METRICS_ONLY_CRITICAL : c0s.METRICS_ALL : c0s.METRICS_UNKNOWN) != null) {
                }
                break;
            default:
                if ((i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : d0s.OPT_UNKNOWN : d0s.POLICY_FORCED_ENABLED : d0s.OPT_OUT : d0s.OPT_IN) != null) {
                }
                break;
        }
        return true;
    }
}
