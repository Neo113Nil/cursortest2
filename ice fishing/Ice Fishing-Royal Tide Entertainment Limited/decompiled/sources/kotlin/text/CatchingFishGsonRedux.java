package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGsonRedux extends CatchingFishRoomDatabinding implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishReduxSpannable CatchingFishCloudMessaging;
    public /* synthetic */ Object CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public long[] CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGsonRedux(CatchingFishReduxSpannable catchingFishReduxSpannable, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(catchingFishWebsocketGradle);
        this.CatchingFishCloudMessaging = catchingFishReduxSpannable;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishGsonRedux catchingFishGsonRedux = new CatchingFishGsonRedux(this.CatchingFishCloudMessaging, catchingFishWebsocketGradle);
        catchingFishGsonRedux.CatchingFishFragmentHandler = obj;
        return catchingFishGsonRedux;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishGsonRedux) CatchingFishCloudMessaging((CatchingFishViewDagger) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bd -> B:7:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:20:0x0095). Please report as a decompilation issue!!! */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishViewDagger catchingFishViewDagger;
        long[] jArr;
        int length;
        int i;
        CatchingFishViewDagger catchingFishViewDagger2;
        int i2;
        CatchingFishViewDagger catchingFishViewDagger3;
        int i3;
        CatchingFishReduxSpannable catchingFishReduxSpannable = this.CatchingFishCloudMessaging;
        long j = catchingFishReduxSpannable.CatchingFishReduxKtor;
        long j2 = catchingFishReduxSpannable.CatchingFishWorkManager;
        long j3 = catchingFishReduxSpannable.CatchingFishDaggerWebsocket;
        int i4 = this.CatchingFishLayout;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (i4 == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            catchingFishViewDagger = (CatchingFishViewDagger) this.CatchingFishFragmentHandler;
            jArr = catchingFishReduxSpannable.CatchingFishViewModelScope;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                catchingFishViewDagger2 = catchingFishViewDagger;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
        if (i4 == 1) {
            length = this.CatchingFishViewModelFAB;
            int i5 = this.CatchingFishViewModelScope;
            jArr = this.CatchingFishWorkManager;
            catchingFishViewDagger = (CatchingFishViewDagger) this.CatchingFishFragmentHandler;
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = this.CatchingFishViewModelScope;
                catchingFishViewDagger3 = (CatchingFishViewDagger) this.CatchingFishFragmentHandler;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + i3 + 64);
                        this.CatchingFishFragmentHandler = catchingFishViewDagger3;
                        this.CatchingFishWorkManager = null;
                        this.CatchingFishViewModelScope = i3;
                        this.CatchingFishLayout = 3;
                        catchingFishViewDagger3.CatchingFishSnackbar(l, this);
                        return catchingFishXMLLayoutMockk;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            }
            i2 = this.CatchingFishViewModelScope;
            catchingFishViewDagger2 = (CatchingFishViewDagger) this.CatchingFishFragmentHandler;
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            i2++;
            if (i2 >= 64) {
                catchingFishViewDagger = catchingFishViewDagger2;
                if (j != 0) {
                    catchingFishViewDagger3 = catchingFishViewDagger;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + i2);
                this.CatchingFishFragmentHandler = catchingFishViewDagger2;
                this.CatchingFishWorkManager = null;
                this.CatchingFishViewModelScope = i2;
                this.CatchingFishLayout = 2;
                catchingFishViewDagger2.CatchingFishSnackbar(l2, this);
                return catchingFishXMLLayoutMockk;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.CatchingFishFragmentHandler = catchingFishViewDagger;
            this.CatchingFishWorkManager = jArr;
            this.CatchingFishViewModelScope = i;
            this.CatchingFishViewModelFAB = length;
            this.CatchingFishLayout = 1;
            catchingFishViewDagger.CatchingFishSnackbar(l3, this);
            return catchingFishXMLLayoutMockk;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
