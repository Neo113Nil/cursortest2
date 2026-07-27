package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishDaggerXMLLayout implements Runnable {
    public final /* synthetic */ CatchingFishBundleStateFlow CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishViewPagerMockk CatchingFishViewModelScope;
    public final /* synthetic */ Runnable CatchingFishWorkManager;

    public /* synthetic */ CatchingFishDaggerXMLLayout(CatchingFishBundleStateFlow catchingFishBundleStateFlow, Runnable runnable, CatchingFishViewPagerMockk catchingFishViewPagerMockk, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishBundleStateFlow;
        this.CatchingFishWorkManager = runnable;
        this.CatchingFishViewModelScope = catchingFishViewPagerMockk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ExecutorService executorService = this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor;
                final int i = 0;
                final Runnable runnable = this.CatchingFishWorkManager;
                final CatchingFishViewPagerMockk catchingFishViewPagerMockk = this.CatchingFishViewModelScope;
                executorService.execute(new Runnable() { // from class: kotlin.text.CatchingFishContextService
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    catchingFishViewPagerMockk.CatchingFishSpannableWidget(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    catchingFishViewPagerMockk.CatchingFishSpannableWidget(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                CatchingFishViewPagerMockk catchingFishViewPagerMockk2 = catchingFishViewPagerMockk;
                                try {
                                    runnable2.run();
                                    CatchingFishOkHttpCoroutine catchingFishOkHttpCoroutine = (CatchingFishOkHttpCoroutine) catchingFishViewPagerMockk2.CatchingFishDaggerWebsocket;
                                    if (CatchingFishAsyncTask.CatchingFishLayout.CatchingFishEspressoTesting(catchingFishOkHttpCoroutine, null, CatchingFishAsyncTask.CatchingFishFragmentHandler)) {
                                        CatchingFishAsyncTask.CatchingFishCoroutine(catchingFishOkHttpCoroutine);
                                        return;
                                    }
                                    return;
                                } catch (Exception e3) {
                                    catchingFishViewPagerMockk2.CatchingFishSpannableWidget(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor;
                final int i2 = 2;
                final Runnable runnable2 = this.CatchingFishWorkManager;
                final CatchingFishViewPagerMockk catchingFishViewPagerMockk2 = this.CatchingFishViewModelScope;
                executorService2.execute(new Runnable() { // from class: kotlin.text.CatchingFishContextService
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    catchingFishViewPagerMockk2.CatchingFishSpannableWidget(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    catchingFishViewPagerMockk2.CatchingFishSpannableWidget(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                CatchingFishViewPagerMockk catchingFishViewPagerMockk22 = catchingFishViewPagerMockk2;
                                try {
                                    runnable22.run();
                                    CatchingFishOkHttpCoroutine catchingFishOkHttpCoroutine = (CatchingFishOkHttpCoroutine) catchingFishViewPagerMockk22.CatchingFishDaggerWebsocket;
                                    if (CatchingFishAsyncTask.CatchingFishLayout.CatchingFishEspressoTesting(catchingFishOkHttpCoroutine, null, CatchingFishAsyncTask.CatchingFishFragmentHandler)) {
                                        CatchingFishAsyncTask.CatchingFishCoroutine(catchingFishOkHttpCoroutine);
                                        return;
                                    }
                                    return;
                                } catch (Exception e3) {
                                    catchingFishViewPagerMockk22.CatchingFishSpannableWidget(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor;
                final int i3 = 1;
                final Runnable runnable3 = this.CatchingFishWorkManager;
                final CatchingFishViewPagerMockk catchingFishViewPagerMockk3 = this.CatchingFishViewModelScope;
                executorService3.execute(new Runnable() { // from class: kotlin.text.CatchingFishContextService
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    catchingFishViewPagerMockk3.CatchingFishSpannableWidget(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    catchingFishViewPagerMockk3.CatchingFishSpannableWidget(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                CatchingFishViewPagerMockk catchingFishViewPagerMockk22 = catchingFishViewPagerMockk3;
                                try {
                                    runnable22.run();
                                    CatchingFishOkHttpCoroutine catchingFishOkHttpCoroutine = (CatchingFishOkHttpCoroutine) catchingFishViewPagerMockk22.CatchingFishDaggerWebsocket;
                                    if (CatchingFishAsyncTask.CatchingFishLayout.CatchingFishEspressoTesting(catchingFishOkHttpCoroutine, null, CatchingFishAsyncTask.CatchingFishFragmentHandler)) {
                                        CatchingFishAsyncTask.CatchingFishCoroutine(catchingFishOkHttpCoroutine);
                                        return;
                                    }
                                    return;
                                } catch (Exception e3) {
                                    catchingFishViewPagerMockk22.CatchingFishSpannableWidget(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
