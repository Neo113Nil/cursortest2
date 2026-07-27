package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVPRealm extends CatchingFishRoomDatabinding implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishKtorOkHttp CatchingFishAnimationMockk;
    public int CatchingFishCloudMessaging;
    public long CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public int CatchingFishOkHttp;
    public /* synthetic */ Object CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public long[] CatchingFishViewModelScope;
    public Object[] CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMVPRealm(CatchingFishKtorOkHttp catchingFishKtorOkHttp, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(catchingFishWebsocketGradle);
        this.CatchingFishAnimationMockk = catchingFishKtorOkHttp;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishMVPRealm catchingFishMVPRealm = new CatchingFishMVPRealm(this.CatchingFishAnimationMockk, catchingFishWebsocketGradle);
        catchingFishMVPRealm.CatchingFishUnitTesting = obj;
        return catchingFishMVPRealm;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishMVPRealm) CatchingFishCloudMessaging((CatchingFishViewDagger) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:14:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:6:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0069 -> B:5:0x0088). Please report as a decompilation issue!!! */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishViewDagger catchingFishViewDagger;
        Object[] objArr;
        long[] jArr;
        int length;
        int i;
        long j;
        int i2 = this.CatchingFishOkHttp;
        if (i2 == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            catchingFishViewDagger = (CatchingFishViewDagger) this.CatchingFishUnitTesting;
            CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket;
            objArr = catchingFishPayPalService.CatchingFishSnackbar;
            jArr = catchingFishPayPalService.CatchingFishParcelableFAB;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = this.CatchingFishCloudMessaging;
        int i4 = this.CatchingFishFragmentHandler;
        long j2 = this.CatchingFishEspressoTesting;
        i = this.CatchingFishLayout;
        int i5 = this.CatchingFishViewModelFAB;
        long[] jArr2 = this.CatchingFishViewModelScope;
        Object[] objArr2 = this.CatchingFishWorkManager;
        CatchingFishViewDagger catchingFishViewDagger2 = (CatchingFishViewDagger) this.CatchingFishUnitTesting;
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i5;
                jArr = jArr2;
                objArr = objArr2;
                catchingFishViewDagger = catchingFishViewDagger2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        catchingFishViewDagger2 = catchingFishViewDagger;
                        i3 = 0;
                        jArr2 = jArr;
                        i5 = length;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        objArr2 = objArr;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                Object obj2 = objArr2[(i << 3) + i3];
                                this.CatchingFishUnitTesting = catchingFishViewDagger2;
                                this.CatchingFishWorkManager = objArr2;
                                this.CatchingFishViewModelScope = jArr2;
                                this.CatchingFishViewModelFAB = i5;
                                this.CatchingFishLayout = i;
                                this.CatchingFishEspressoTesting = j2;
                                this.CatchingFishFragmentHandler = i4;
                                this.CatchingFishCloudMessaging = i3;
                                this.CatchingFishOkHttp = 1;
                                catchingFishViewDagger2.CatchingFishSnackbar(obj2, this);
                                return CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }
}
