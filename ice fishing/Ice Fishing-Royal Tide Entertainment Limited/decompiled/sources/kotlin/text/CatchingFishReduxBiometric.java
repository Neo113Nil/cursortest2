package kotlin.text;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class CatchingFishReduxBiometric {
    public static final /* synthetic */ CatchingFishReduxBiometric[] CatchingFishLayout;
    public static final CatchingFishHiltMockk CatchingFishViewModelFAB;
    public static final CatchingFishGoogleMapsView CatchingFishViewModelScope;
    public static final CatchingFishToastMVIBundle CatchingFishWorkManager;
    public final int CatchingFishDaggerWebsocket;
    public final CatchingFishExoPlayerDagger CatchingFishReduxKtor;

    /* JADX INFO: Fake field, exist only in values array */
    CatchingFishReduxBiometric EF0;

    /* JADX INFO: Fake field, exist only in values array */
    CatchingFishReduxBiometric EF1;

    /* JADX INFO: Fake field, exist only in values array */
    CatchingFishReduxBiometric EF2;

    static {
        CatchingFishReduxBiometric catchingFishReduxBiometric = new CatchingFishReduxBiometric("DOUBLE", 0, CatchingFishExoPlayerDagger.DOUBLE, 1);
        CatchingFishReduxBiometric catchingFishReduxBiometric2 = new CatchingFishReduxBiometric("FLOAT", 1, CatchingFishExoPlayerDagger.FLOAT, 5);
        CatchingFishExoPlayerDagger catchingFishExoPlayerDagger = CatchingFishExoPlayerDagger.LONG;
        CatchingFishReduxBiometric catchingFishReduxBiometric3 = new CatchingFishReduxBiometric("INT64", 2, catchingFishExoPlayerDagger, 0);
        CatchingFishReduxBiometric catchingFishReduxBiometric4 = new CatchingFishReduxBiometric("UINT64", 3, catchingFishExoPlayerDagger, 0);
        CatchingFishExoPlayerDagger catchingFishExoPlayerDagger2 = CatchingFishExoPlayerDagger.INT;
        CatchingFishReduxBiometric catchingFishReduxBiometric5 = new CatchingFishReduxBiometric("INT32", 4, catchingFishExoPlayerDagger2, 0);
        CatchingFishReduxBiometric catchingFishReduxBiometric6 = new CatchingFishReduxBiometric("FIXED64", 5, catchingFishExoPlayerDagger, 1);
        CatchingFishReduxBiometric catchingFishReduxBiometric7 = new CatchingFishReduxBiometric("FIXED32", 6, catchingFishExoPlayerDagger2, 5);
        CatchingFishReduxBiometric catchingFishReduxBiometric8 = new CatchingFishReduxBiometric("BOOL", 7, CatchingFishExoPlayerDagger.BOOLEAN, 0);
        CatchingFishToastMVIBundle catchingFishToastMVIBundle = new CatchingFishToastMVIBundle("STRING", 8, CatchingFishExoPlayerDagger.STRING, 2);
        CatchingFishWorkManager = catchingFishToastMVIBundle;
        CatchingFishExoPlayerDagger catchingFishExoPlayerDagger3 = CatchingFishExoPlayerDagger.MESSAGE;
        CatchingFishGoogleMapsView catchingFishGoogleMapsView = new CatchingFishGoogleMapsView("GROUP", 9, catchingFishExoPlayerDagger3, 3);
        CatchingFishViewModelScope = catchingFishGoogleMapsView;
        CatchingFishHiltMockk catchingFishHiltMockk = new CatchingFishHiltMockk("MESSAGE", 10, catchingFishExoPlayerDagger3, 2);
        CatchingFishViewModelFAB = catchingFishHiltMockk;
        CatchingFishLayout = new CatchingFishReduxBiometric[]{catchingFishReduxBiometric, catchingFishReduxBiometric2, catchingFishReduxBiometric3, catchingFishReduxBiometric4, catchingFishReduxBiometric5, catchingFishReduxBiometric6, catchingFishReduxBiometric7, catchingFishReduxBiometric8, catchingFishToastMVIBundle, catchingFishGoogleMapsView, catchingFishHiltMockk, new CatchingFishMVPViewPager("BYTES", 11, CatchingFishExoPlayerDagger.BYTE_STRING, 2), new CatchingFishReduxBiometric("UINT32", 12, catchingFishExoPlayerDagger2, 0), new CatchingFishReduxBiometric("ENUM", 13, CatchingFishExoPlayerDagger.ENUM, 0), new CatchingFishReduxBiometric("SFIXED32", 14, catchingFishExoPlayerDagger2, 5), new CatchingFishReduxBiometric("SFIXED64", 15, catchingFishExoPlayerDagger, 1), new CatchingFishReduxBiometric("SINT32", 16, catchingFishExoPlayerDagger2, 0), new CatchingFishReduxBiometric("SINT64", 17, catchingFishExoPlayerDagger, 0)};
    }

    public CatchingFishReduxBiometric(String str, int i, CatchingFishExoPlayerDagger catchingFishExoPlayerDagger, int i2) {
        this.CatchingFishReduxKtor = catchingFishExoPlayerDagger;
        this.CatchingFishDaggerWebsocket = i2;
    }

    public static CatchingFishReduxBiometric valueOf(String str) {
        return (CatchingFishReduxBiometric) Enum.valueOf(CatchingFishReduxBiometric.class, str);
    }

    public static CatchingFishReduxBiometric[] values() {
        return (CatchingFishReduxBiometric[]) CatchingFishLayout.clone();
    }
}
