package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltViewFlux extends CatchingFishStateFlowGson {
    public final /* synthetic */ CatchingFishWebsocketGradle CatchingFishLayout;
    public final /* synthetic */ CatchingFishMockkView CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishHiltViewFlux(CatchingFishWebsocketGradle catchingFishWebsocketGradle, CatchingFishManifestMockk catchingFishManifestMockk, CatchingFishMockkView catchingFishMockkView, CatchingFishWebsocketGradle catchingFishWebsocketGradle2) {
        super(catchingFishWebsocketGradle, catchingFishManifestMockk);
        this.CatchingFishViewModelFAB = catchingFishMockkView;
        this.CatchingFishLayout = catchingFishWebsocketGradle2;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelScope;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.CatchingFishViewModelScope = 2;
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            return obj;
        }
        this.CatchingFishViewModelScope = 1;
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        CatchingFishMockkView catchingFishMockkView = this.CatchingFishViewModelFAB;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishMockkView, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        CatchingFishLayoutRoomFAB.CatchingFishFragmentHandler(2, catchingFishMockkView);
        return catchingFishMockkView.CatchingFishDaggerWebsocket(this.CatchingFishLayout, this);
    }
}
