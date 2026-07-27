package kotlin.text;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import java.util.ArrayList;
import kotlin.text.CatchingFishExoPlayerOkHttp;
import kotlin.text.CatchingFishFABStripeAPIFAB;

/* loaded from: classes.dex */
public final class CatchingFishExoPlayerOkHttp implements CatchingFishViewManifest {
    public final CatchingFishGradleCameraX CatchingFishParcelableFAB;
    public final CatchingFishKtorLayout CatchingFishReduxKtor;
    public final CatchingFishGradleCameraX CatchingFishSnackbar;
    public CatchingFishAppCompatWidget CatchingFishViewModelFAB;
    public CatchingFishGlideXMLLayout CatchingFishWorkManager;
    public final CatchingFishAppCompatWidget CatchingFishCoroutine = new CatchingFishAppCompatWidget(6);
    public final FocusOwnerImpl$modifier$1 CatchingFishDaggerWebsocket = new CatchingFishAppCompatMVVM() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // kotlin.text.CatchingFishAppCompatMVVM
        public final /* bridge */ /* synthetic */ void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        }

        @Override // kotlin.text.CatchingFishAppCompatMVVM
        public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
            return CatchingFishExoPlayerOkHttp.this.CatchingFishCoroutine;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return CatchingFishExoPlayerOkHttp.this.CatchingFishCoroutine.hashCode();
        }
    };
    public final CatchingFishBundleGradle CatchingFishViewModelScope = new CatchingFishBundleGradle(1);

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public CatchingFishExoPlayerOkHttp(CatchingFishGradleCameraX catchingFishGradleCameraX, CatchingFishGradleCameraX catchingFishGradleCameraX2) {
        this.CatchingFishParcelableFAB = catchingFishGradleCameraX;
        this.CatchingFishSnackbar = catchingFishGradleCameraX2;
        this.CatchingFishReduxKtor = new CatchingFishKtorLayout(this, catchingFishGradleCameraX2);
    }

    public final void CatchingFishCoroutine() {
        CatchingFishGradleCameraX catchingFishGradleCameraX = this.CatchingFishParcelableFAB;
        if (catchingFishGradleCameraX.isFocused() || catchingFishGradleCameraX.hasFocus()) {
            catchingFishGradleCameraX.clearFocus();
        } else if (catchingFishGradleCameraX.hasFocus()) {
            View findFocus = catchingFishGradleCameraX.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            catchingFishGradleCameraX.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r6v11, types: [kotlin.text.CatchingFishServiceHandler, kotlin.text.CatchingFishViewWebsocket] */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.text.CatchingFishServiceHandler, kotlin.text.CatchingFishViewWebsocket] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean CatchingFishDaggerWebsocket(int i, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer, CatchingFishServiceHandler catchingFishServiceHandler) {
        boolean CatchingFishSnackbar;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle;
        CatchingFishMVIMoshiMVP catchingFishMVIMoshiMVP;
        CatchingFishMVIMoshiMVP catchingFishMVIMoshiMVP2;
        boolean z;
        CatchingFishAppCompatWidget catchingFishAppCompatWidget = this.CatchingFishCoroutine;
        CatchingFishAppCompatWidget CatchingFishNavigation = CatchingFishGsonCardView.CatchingFishNavigation(catchingFishAppCompatWidget);
        int i2 = 4;
        CatchingFishGradleCameraX catchingFishGradleCameraX = this.CatchingFishSnackbar;
        CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = null;
        if (CatchingFishNavigation != null) {
            CatchingFishGradleMVPKtor layoutDirection = catchingFishGradleCameraX.getLayoutDirection();
            CatchingFishCardViewFlux CatchingFishCardViewView = CatchingFishNavigation.CatchingFishCardViewView();
            if (i == 1) {
                catchingFishMVIMoshiMVP = CatchingFishCardViewView.CatchingFishSnackbar;
            } else if (i == 2) {
                catchingFishMVIMoshiMVP = CatchingFishCardViewView.CatchingFishCoroutine;
            } else if (i == 5) {
                catchingFishMVIMoshiMVP = CatchingFishCardViewView.CatchingFishReduxKtor;
            } else if (i == 6) {
                catchingFishMVIMoshiMVP = CatchingFishCardViewView.CatchingFishDaggerWebsocket;
            } else if (i == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal == 0) {
                    catchingFishMVIMoshiMVP2 = CatchingFishCardViewView.CatchingFishViewModelFAB;
                } else {
                    if (ordinal != 1) {
                        throw new CatchingFishBiometricView();
                    }
                    catchingFishMVIMoshiMVP2 = CatchingFishCardViewView.CatchingFishLayout;
                }
                if (catchingFishMVIMoshiMVP2 == CatchingFishMVIMoshiMVP.CatchingFishSnackbar) {
                    catchingFishMVIMoshiMVP2 = null;
                }
                if (catchingFishMVIMoshiMVP2 == null) {
                    catchingFishMVIMoshiMVP = CatchingFishCardViewView.CatchingFishWorkManager;
                }
                catchingFishMVIMoshiMVP = catchingFishMVIMoshiMVP2;
            } else if (i == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    catchingFishMVIMoshiMVP2 = CatchingFishCardViewView.CatchingFishLayout;
                } else {
                    if (ordinal2 != 1) {
                        throw new CatchingFishBiometricView();
                    }
                    catchingFishMVIMoshiMVP2 = CatchingFishCardViewView.CatchingFishViewModelFAB;
                }
                if (catchingFishMVIMoshiMVP2 == CatchingFishMVIMoshiMVP.CatchingFishSnackbar) {
                    catchingFishMVIMoshiMVP2 = null;
                }
                if (catchingFishMVIMoshiMVP2 == null) {
                    catchingFishMVIMoshiMVP = CatchingFishCardViewView.CatchingFishViewModelScope;
                }
                catchingFishMVIMoshiMVP = catchingFishMVIMoshiMVP2;
            } else {
                if (i != 7 && i != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                CatchingFishHiltSnackbar catchingFishHiltSnackbar = new CatchingFishHiltSnackbar(i);
                CatchingFishExoPlayerOkHttp catchingFishExoPlayerOkHttp = (CatchingFishExoPlayerOkHttp) ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(CatchingFishNavigation)).getFocusOwner();
                CatchingFishAppCompatWidget catchingFishAppCompatWidget3 = catchingFishExoPlayerOkHttp.CatchingFishViewModelFAB;
                if (i == 7) {
                    CatchingFishCardViewView.CatchingFishFragmentHandler.CatchingFishFragmentHandler(catchingFishHiltSnackbar);
                } else {
                    CatchingFishCardViewView.CatchingFishCloudMessaging.CatchingFishFragmentHandler(catchingFishHiltSnackbar);
                }
                catchingFishMVIMoshiMVP = catchingFishHiltSnackbar.CatchingFishSnackbar ? CatchingFishMVIMoshiMVP.CatchingFishCoroutine : catchingFishAppCompatWidget3 != catchingFishExoPlayerOkHttp.CatchingFishViewModelFAB ? CatchingFishMVIMoshiMVP.CatchingFishReduxKtor : CatchingFishMVIMoshiMVP.CatchingFishSnackbar;
            }
            CatchingFishMVIMoshiMVP catchingFishMVIMoshiMVP3 = CatchingFishMVIMoshiMVP.CatchingFishCoroutine;
            if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishMVIMoshiMVP, catchingFishMVIMoshiMVP3)) {
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishMVIMoshiMVP, CatchingFishMVIMoshiMVP.CatchingFishReduxKtor)) {
                    Object CatchingFishNavigation2 = CatchingFishGsonCardView.CatchingFishNavigation(catchingFishAppCompatWidget);
                    if (CatchingFishNavigation2 != null) {
                        return (Boolean) catchingFishServiceHandler.CatchingFishFragmentHandler(CatchingFishNavigation2);
                    }
                } else {
                    CatchingFishMVIMoshiMVP catchingFishMVIMoshiMVP4 = CatchingFishMVIMoshiMVP.CatchingFishSnackbar;
                    if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishMVIMoshiMVP, catchingFishMVIMoshiMVP4)) {
                        catchingFishMVIMoshiMVP.getClass();
                        if (catchingFishMVIMoshiMVP == catchingFishMVIMoshiMVP4) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        if (catchingFishMVIMoshiMVP == catchingFishMVIMoshiMVP3) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        CatchingFishFABToast catchingFishFABToast = catchingFishMVIMoshiMVP.CatchingFishParcelableFAB;
                        int i3 = catchingFishFABToast.CatchingFishWorkManager;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            z = false;
                        } else {
                            Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
                            boolean z2 = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                CatchingFishAdMobPicasso catchingFishAdMobPicasso = (CatchingFishAdMobPicasso) objArr[i4];
                                if (!catchingFishAdMobPicasso.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
                                    CatchingFishFluxGradle.CatchingFishSnackbar("visitChildren called on an unattached node");
                                }
                                CatchingFishFABToast catchingFishFABToast2 = new CatchingFishFABToast(new CatchingFishFABStripeAPIFAB[16]);
                                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = catchingFishAdMobPicasso.CatchingFishReduxKtor;
                                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB.CatchingFishLayout;
                                if (catchingFishFABStripeAPIFAB2 == null) {
                                    CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast2, catchingFishFABStripeAPIFAB);
                                } else {
                                    catchingFishFABToast2.CatchingFishSnackbar(catchingFishFABStripeAPIFAB2);
                                }
                                while (true) {
                                    int i5 = catchingFishFABToast2.CatchingFishWorkManager;
                                    if (i5 != 0) {
                                        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = (CatchingFishFABStripeAPIFAB) catchingFishFABToast2.CatchingFishFragmentHandler(i5 - 1);
                                        if ((catchingFishFABStripeAPIFAB3.CatchingFishViewModelScope & 1024) == 0) {
                                            CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast2, catchingFishFABStripeAPIFAB3);
                                        } else {
                                            while (true) {
                                                if (catchingFishFABStripeAPIFAB3 == null) {
                                                    break;
                                                }
                                                if ((catchingFishFABStripeAPIFAB3.CatchingFishWorkManager & 1024) != 0) {
                                                    while (catchingFishFABStripeAPIFAB3 != null) {
                                                        if (catchingFishFABStripeAPIFAB3 instanceof CatchingFishAppCompatWidget) {
                                                            CatchingFishAppCompatWidget catchingFishAppCompatWidget4 = (CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB3;
                                                            if (catchingFishAppCompatWidget4.CatchingFishCardViewView().CatchingFishParcelableFAB ? ((Boolean) catchingFishServiceHandler.CatchingFishFragmentHandler(catchingFishAppCompatWidget4)).booleanValue() : CatchingFishOkHttpFAB.CatchingFishJetpackCompose(catchingFishAppCompatWidget4, 7, catchingFishServiceHandler)) {
                                                                z2 = true;
                                                                break;
                                                            }
                                                        }
                                                        catchingFishFABStripeAPIFAB3 = null;
                                                    }
                                                } else {
                                                    catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB3.CatchingFishLayout;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z = z2;
                        }
                        return Boolean.valueOf(z);
                    }
                }
            }
            return null;
        }
        CatchingFishNavigation = null;
        CatchingFishGradleMVPKtor layoutDirection2 = catchingFishGradleCameraX.getLayoutDirection();
        CatchingFishMVPBiometric catchingFishMVPBiometric = new CatchingFishMVPBiometric(CatchingFishNavigation, this, catchingFishServiceHandler);
        if (i == 1 || i == 2) {
            if (i == 1) {
                CatchingFishSnackbar = CatchingFishKtorViewModel.CatchingFishEspressoTesting(catchingFishAppCompatWidget, catchingFishMVPBiometric);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                CatchingFishSnackbar = CatchingFishKtorViewModel.CatchingFishSnackbar(catchingFishAppCompatWidget, catchingFishMVPBiometric);
            }
            return Boolean.valueOf(CatchingFishSnackbar);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return CatchingFishOkHttpFAB.CatchingFishStripeAPI(i, catchingFishMVPBiometric, catchingFishAppCompatWidget, catchingFishFluxExoPlayer);
        }
        if (i == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new CatchingFishBiometricView();
                }
                i2 = 3;
            }
            CatchingFishAppCompatWidget CatchingFishNavigation3 = CatchingFishGsonCardView.CatchingFishNavigation(catchingFishAppCompatWidget);
            if (CatchingFishNavigation3 != null) {
                return CatchingFishOkHttpFAB.CatchingFishStripeAPI(i2, catchingFishMVPBiometric, CatchingFishNavigation3, catchingFishFluxExoPlayer);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) CatchingFishViewPagerFAB.CatchingFishParcelableFAB(i))).toString());
        }
        CatchingFishAppCompatWidget CatchingFishNavigation4 = CatchingFishGsonCardView.CatchingFishNavigation(catchingFishAppCompatWidget);
        if (CatchingFishNavigation4 != null) {
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB4 = CatchingFishNavigation4.CatchingFishReduxKtor;
            if (!catchingFishFABStripeAPIFAB4.CatchingFishRoomDatabase) {
                CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
            }
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB5 = catchingFishFABStripeAPIFAB4.CatchingFishViewModelFAB;
            CatchingFishBiometricRoom CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(CatchingFishNavigation4);
            loop4: while (true) {
                if (CatchingFishJobScheduler == null) {
                    break;
                }
                if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 1024) != 0) {
                    while (catchingFishFABStripeAPIFAB5 != null) {
                        if ((catchingFishFABStripeAPIFAB5.CatchingFishWorkManager & 1024) != 0) {
                            for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB6 = catchingFishFABStripeAPIFAB5; catchingFishFABStripeAPIFAB6 != null; catchingFishFABStripeAPIFAB6 = null) {
                                if (catchingFishFABStripeAPIFAB6 instanceof CatchingFishAppCompatWidget) {
                                    CatchingFishAppCompatWidget catchingFishAppCompatWidget5 = (CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB6;
                                    if (catchingFishAppCompatWidget5.CatchingFishCardViewView().CatchingFishParcelableFAB) {
                                        catchingFishAppCompatWidget2 = catchingFishAppCompatWidget5;
                                        break loop4;
                                    }
                                }
                            }
                        }
                        catchingFishFABStripeAPIFAB5 = catchingFishFABStripeAPIFAB5.CatchingFishViewModelFAB;
                    }
                }
                CatchingFishJobScheduler = CatchingFishJobScheduler.CatchingFishRoomDatabase();
                catchingFishFABStripeAPIFAB5 = (CatchingFishJobScheduler == null || (catchingFishExoPlayerBundle = CatchingFishJobScheduler.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle.CatchingFishLayout;
            }
        }
        CatchingFishAppCompatWidget catchingFishAppCompatWidget6 = catchingFishAppCompatWidget2;
        return Boolean.valueOf((catchingFishAppCompatWidget6 == null || catchingFishAppCompatWidget6.equals(catchingFishAppCompatWidget)) ? false : ((Boolean) catchingFishMVPBiometric.CatchingFishFragmentHandler(catchingFishAppCompatWidget6)).booleanValue());
    }

    public final boolean CatchingFishParcelableFAB(boolean z) {
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle;
        CatchingFishAppCompatWidget catchingFishAppCompatWidget = this.CatchingFishViewModelFAB;
        if (catchingFishAppCompatWidget == null) {
            return true;
        }
        CatchingFishWorkManager(null);
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = catchingFishAppCompatWidget.CatchingFishReduxKtor;
        CatchingFishFABBiometric catchingFishFABBiometric = CatchingFishFABBiometric.CatchingFishReduxKtor;
        CatchingFishFABBiometric catchingFishFABBiometric2 = CatchingFishFABBiometric.CatchingFishViewModelScope;
        catchingFishAppCompatWidget.CatchingFishPayPal(catchingFishFABBiometric, catchingFishFABBiometric2);
        if (!catchingFishFABStripeAPIFAB.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
        }
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB.CatchingFishViewModelFAB;
        CatchingFishBiometricRoom CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget);
        while (CatchingFishJobScheduler != null) {
            if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 1024) != 0) {
                while (catchingFishFABStripeAPIFAB2 != null) {
                    if ((catchingFishFABStripeAPIFAB2.CatchingFishWorkManager & 1024) != 0) {
                        for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB2; catchingFishFABStripeAPIFAB3 != null; catchingFishFABStripeAPIFAB3 = null) {
                            if (catchingFishFABStripeAPIFAB3 instanceof CatchingFishAppCompatWidget) {
                                ((CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB3).CatchingFishPayPal(CatchingFishFABBiometric.CatchingFishDaggerWebsocket, catchingFishFABBiometric2);
                            }
                        }
                    }
                    catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB2.CatchingFishViewModelFAB;
                }
            }
            CatchingFishJobScheduler = CatchingFishJobScheduler.CatchingFishRoomDatabase();
            catchingFishFABStripeAPIFAB2 = (CatchingFishJobScheduler == null || (catchingFishExoPlayerBundle = CatchingFishJobScheduler.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle.CatchingFishLayout;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r6 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:13:0x0026, B:16:0x002f, B:18:0x0035, B:19:0x003a, B:21:0x0040, B:23:0x0045, B:25:0x004b, B:29:0x0051, B:34:0x00f6, B:36:0x00fc, B:37:0x00ff, B:39:0x0108, B:42:0x0116, B:46:0x011f, B:49:0x0125, B:50:0x012a, B:55:0x012f, B:58:0x0132, B:60:0x0138, B:67:0x013c, B:72:0x0145, B:74:0x014d, B:81:0x0160, B:83:0x0164, B:88:0x0168, B:94:0x017b, B:96:0x017f, B:98:0x0185, B:109:0x01a0, B:111:0x01a7, B:113:0x01b1, B:127:0x0059, B:129:0x005f, B:130:0x0062, B:132:0x0068, B:135:0x0076, B:139:0x007f, B:144:0x009b, B:146:0x009f, B:148:0x0086, B:151:0x0089, B:153:0x008f, B:160:0x0093, B:165:0x00a4, B:167:0x00aa, B:168:0x00ad, B:170:0x00b7, B:173:0x00c5, B:177:0x00ce, B:182:0x00ea, B:184:0x00ee, B:187:0x00d5, B:190:0x00d8, B:192:0x00de, B:199:0x00e2), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishReduxKtor(KeyEvent keyEvent, CatchingFishJUnitGlide catchingFishJUnitGlide) {
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle2;
        int size;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle3;
        CatchingFishAppCompatWidget catchingFishAppCompatWidget = this.CatchingFishCoroutine;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!CatchingFishViewModelScope(keyEvent)) {
                return false;
            }
            CatchingFishAppCompatWidget CatchingFishNavigation = CatchingFishGsonCardView.CatchingFishNavigation(catchingFishAppCompatWidget);
            if (CatchingFishNavigation != null) {
                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB4 = CatchingFishNavigation.CatchingFishReduxKtor;
                if (!catchingFishFABStripeAPIFAB4.CatchingFishRoomDatabase) {
                    CatchingFishFluxGradle.CatchingFishSnackbar("visitLocalDescendants called on an unattached node");
                }
                if ((catchingFishFABStripeAPIFAB4.CatchingFishViewModelScope & 9216) != 0) {
                    catchingFishFABStripeAPIFAB2 = null;
                    for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB5 = catchingFishFABStripeAPIFAB4.CatchingFishLayout; catchingFishFABStripeAPIFAB5 != null; catchingFishFABStripeAPIFAB5 = catchingFishFABStripeAPIFAB5.CatchingFishLayout) {
                        int i = catchingFishFABStripeAPIFAB5.CatchingFishWorkManager;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB5;
                        }
                    }
                } else {
                    catchingFishFABStripeAPIFAB2 = null;
                }
            }
            if (CatchingFishNavigation != null) {
                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB6 = CatchingFishNavigation.CatchingFishReduxKtor;
                if (!catchingFishFABStripeAPIFAB6.CatchingFishRoomDatabase) {
                    CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
                }
                CatchingFishBiometricRoom CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(CatchingFishNavigation);
                loop8: while (true) {
                    if (CatchingFishJobScheduler == null) {
                        catchingFishFABStripeAPIFAB3 = null;
                        break;
                    }
                    if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 8192) != 0) {
                        while (catchingFishFABStripeAPIFAB6 != null) {
                            if ((catchingFishFABStripeAPIFAB6.CatchingFishWorkManager & 8192) != 0) {
                                catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB6;
                                while (catchingFishFABStripeAPIFAB3 != null) {
                                    if (catchingFishFABStripeAPIFAB3 instanceof CatchingFishLayoutIntent) {
                                        break loop8;
                                    }
                                    catchingFishFABStripeAPIFAB3 = null;
                                }
                            }
                            catchingFishFABStripeAPIFAB6 = catchingFishFABStripeAPIFAB6.CatchingFishViewModelFAB;
                        }
                    }
                    CatchingFishJobScheduler = CatchingFishJobScheduler.CatchingFishRoomDatabase();
                    catchingFishFABStripeAPIFAB6 = (CatchingFishJobScheduler == null || (catchingFishExoPlayerBundle2 = CatchingFishJobScheduler.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle2.CatchingFishLayout;
                }
                CatchingFishLayoutIntent catchingFishLayoutIntent = (CatchingFishLayoutIntent) catchingFishFABStripeAPIFAB3;
                if (catchingFishLayoutIntent != null) {
                    catchingFishFABStripeAPIFAB2 = catchingFishLayoutIntent.CatchingFishReduxKtor;
                    if (catchingFishFABStripeAPIFAB2 != null) {
                        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB7 = catchingFishFABStripeAPIFAB2.CatchingFishReduxKtor;
                        if (!catchingFishFABStripeAPIFAB7.CatchingFishRoomDatabase) {
                            CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
                        }
                        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB8 = catchingFishFABStripeAPIFAB7.CatchingFishViewModelFAB;
                        CatchingFishBiometricRoom CatchingFishJobScheduler2 = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishFABStripeAPIFAB2);
                        ArrayList arrayList = null;
                        while (CatchingFishJobScheduler2 != null) {
                            if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler2.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 8192) != 0) {
                                while (catchingFishFABStripeAPIFAB8 != null) {
                                    if ((catchingFishFABStripeAPIFAB8.CatchingFishWorkManager & 8192) != 0) {
                                        for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB9 = catchingFishFABStripeAPIFAB8; catchingFishFABStripeAPIFAB9 != null; catchingFishFABStripeAPIFAB9 = null) {
                                            if (catchingFishFABStripeAPIFAB9 instanceof CatchingFishLayoutIntent) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(catchingFishFABStripeAPIFAB9);
                                            }
                                        }
                                    }
                                    catchingFishFABStripeAPIFAB8 = catchingFishFABStripeAPIFAB8.CatchingFishViewModelFAB;
                                }
                            }
                            CatchingFishJobScheduler2 = CatchingFishJobScheduler2.CatchingFishRoomDatabase();
                            catchingFishFABStripeAPIFAB8 = (CatchingFishJobScheduler2 == null || (catchingFishExoPlayerBundle3 = CatchingFishJobScheduler2.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle3.CatchingFishLayout;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i2 = size - 1;
                                ((CatchingFishLayoutIntent) arrayList.get(size)).getClass();
                                if (i2 < 0) {
                                    break;
                                }
                                size = i2;
                            }
                        }
                        for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB10 = catchingFishFABStripeAPIFAB7; catchingFishFABStripeAPIFAB10 != null; catchingFishFABStripeAPIFAB10 = null) {
                            if (catchingFishFABStripeAPIFAB10 instanceof CatchingFishLayoutIntent) {
                            }
                        }
                        if (((Boolean) catchingFishJUnitGlide.CatchingFishParcelableFAB()).booleanValue()) {
                            return true;
                        }
                        while (catchingFishFABStripeAPIFAB7 != null) {
                            if (catchingFishFABStripeAPIFAB7 instanceof CatchingFishLayoutIntent) {
                                CatchingFishRoomDaggerHilt catchingFishRoomDaggerHilt = ((CatchingFishLayoutIntent) catchingFishFABStripeAPIFAB7).CatchingFishNavigation;
                                if (catchingFishRoomDaggerHilt != null ? ((Boolean) catchingFishRoomDaggerHilt.CatchingFishFragmentHandler(new CatchingFishWorkManagerFAB(keyEvent))).booleanValue() : false) {
                                    return true;
                                }
                            }
                            catchingFishFABStripeAPIFAB7 = null;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                CatchingFishRoomDaggerHilt catchingFishRoomDaggerHilt2 = ((CatchingFishLayoutIntent) arrayList.get(i3)).CatchingFishNavigation;
                                if (catchingFishRoomDaggerHilt2 != null ? ((Boolean) catchingFishRoomDaggerHilt2.CatchingFishFragmentHandler(new CatchingFishWorkManagerFAB(keyEvent))).booleanValue() : false) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!catchingFishAppCompatWidget.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
                CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
            }
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB11 = catchingFishAppCompatWidget.CatchingFishReduxKtor.CatchingFishViewModelFAB;
            CatchingFishBiometricRoom CatchingFishJobScheduler3 = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget);
            loop11: while (true) {
                if (CatchingFishJobScheduler3 == null) {
                    catchingFishFABStripeAPIFAB = null;
                    break;
                }
                if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler3.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 8192) != 0) {
                    while (catchingFishFABStripeAPIFAB11 != null) {
                        if ((catchingFishFABStripeAPIFAB11.CatchingFishWorkManager & 8192) != 0) {
                            catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB11;
                            while (catchingFishFABStripeAPIFAB != null) {
                                if (catchingFishFABStripeAPIFAB instanceof CatchingFishLayoutIntent) {
                                    break loop11;
                                }
                                catchingFishFABStripeAPIFAB = null;
                            }
                        }
                        catchingFishFABStripeAPIFAB11 = catchingFishFABStripeAPIFAB11.CatchingFishViewModelFAB;
                    }
                }
                CatchingFishJobScheduler3 = CatchingFishJobScheduler3.CatchingFishRoomDatabase();
                catchingFishFABStripeAPIFAB11 = (CatchingFishJobScheduler3 == null || (catchingFishExoPlayerBundle = CatchingFishJobScheduler3.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle.CatchingFishLayout;
            }
            CatchingFishLayoutIntent catchingFishLayoutIntent2 = (CatchingFishLayoutIntent) catchingFishFABStripeAPIFAB;
            catchingFishFABStripeAPIFAB2 = catchingFishLayoutIntent2 != null ? catchingFishLayoutIntent2.CatchingFishReduxKtor : null;
            if (catchingFishFABStripeAPIFAB2 != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    public final boolean CatchingFishSnackbar(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            CatchingFishParcelableFAB(z);
        } else {
            int ordinal = CatchingFishBiometricBundle.CatchingFishPayPal(this.CatchingFishCoroutine, i).ordinal();
            if (ordinal == 0) {
                CatchingFishParcelableFAB(z);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    throw new CatchingFishBiometricView();
                }
                z3 = false;
            }
        }
        if (z3 && z2) {
            CatchingFishCoroutine();
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0338, code lost:
    
        if (((r8 & ((~r8) << 6)) & r34) == 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x033a, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        r35 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        if (((((~r10) << 6) & r10) & (-9187201950435737472L)) == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        r3 = r4.CatchingFishSnackbar(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (r4.CatchingFishDaggerWebsocket != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        if (((r4.CatchingFishParcelableFAB[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        r3 = r4.CatchingFishCoroutine;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
    
        if (r3 <= 8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
    
        if (java.lang.Long.compare((r4.CatchingFishReduxKtor * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00eb, code lost:
    
        r3 = r4.CatchingFishParcelableFAB;
        r5 = r4.CatchingFishCoroutine;
        r6 = r4.CatchingFishSnackbar;
        r10 = (r5 + 7) >> 3;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        if (r11 >= r10) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f9, code lost:
    
        r8 = r3[r11] & (-9187201950435737472L);
        r23 = r11;
        r3[r23] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r11 = r23 + 1;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        r27 = 128;
        r8 = kotlin.text.CatchingFishMVVMHilt.CatchingFishStripeAPI(r3);
        r9 = r8 - 1;
        r14 = 72057594037927935L;
        r3[r9] = (r3[r9] & 72057594037927935L) | (-72057594037927936L);
        r3[r8] = r3[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012e, code lost:
    
        if (r8 == r5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0130, code lost:
    
        r9 = r8 >> 3;
        r16 = (r8 & 7) << 3;
        r10 = (r3[r9] >> r16) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013e, code lost:
    
        if (r10 != 128) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0145, code lost:
    
        if (r10 == 254) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0148, code lost:
    
        r10 = java.lang.Long.hashCode(r6[r8]) * r29;
        r11 = (r10 ^ (r10 << 16)) >>> 7;
        r23 = r4.CatchingFishSnackbar(r11);
        r11 = r11 & r5;
        r36 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0169, code lost:
    
        if ((((r23 - r11) & r5) / 8) != (((r8 - r11) & r5) / 8)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016b, code lost:
    
        r25 = r5;
        r26 = r6;
        r3[r9] = ((~(255 << r16)) & r3[r9]) | ((r10 & 127) << r16);
        r3[r3.length - 1] = (r3[0] & r36) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0188, code lost:
    
        r8 = r8 + 1;
        r5 = r25;
        r6 = r26;
        r14 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0191, code lost:
    
        r25 = r5;
        r26 = r6;
        r5 = r23 >> 3;
        r14 = r3[r5];
        r6 = (r23 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a3, code lost:
    
        if (((r14 >> r6) & 255) != 128) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a5, code lost:
    
        r3[r5] = ((~(255 << r6)) & r14) | ((r10 & 127) << r6);
        r3[r9] = (r3[r9] & (~(255 << r16))) | (128 << r16);
        r26[r23] = r26[r8];
        r26[r8] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e1, code lost:
    
        r3[r3.length - 1] = (r3[0] & r36) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c7, code lost:
    
        r3[r5] = ((r10 & 127) << r6) | ((~(255 << r6)) & r14);
        r5 = r26[r23];
        r26[r23] = r26[r8];
        r26[r8] = r5;
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0140, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ed, code lost:
    
        r4.CatchingFishDaggerWebsocket = kotlin.text.CatchingFishViewPayPal.CatchingFishParcelableFAB(r4.CatchingFishCoroutine) - r4.CatchingFishReduxKtor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0274, code lost:
    
        r3 = r4.CatchingFishSnackbar(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0278, code lost:
    
        r34 = r3;
        r4.CatchingFishReduxKtor++;
        r3 = r4.CatchingFishDaggerWebsocket;
        r5 = r4.CatchingFishParcelableFAB;
        r6 = r34 >> 3;
        r7 = r5[r6];
        r9 = (r34 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0292, code lost:
    
        if (((r7 >> r9) & 255) != r27) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0294, code lost:
    
        r10 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0299, code lost:
    
        r4.CatchingFishDaggerWebsocket = r3 - r10;
        r3 = r4.CatchingFishCoroutine;
        r7 = (r7 & (~(255 << r9))) | (r12 << r9);
        r5[r6] = r7;
        r5[(((r34 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0297, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01fa, code lost:
    
        r27 = 128;
        r3 = kotlin.text.CatchingFishViewPayPal.CatchingFishSnackbar(r4.CatchingFishCoroutine);
        r5 = r4.CatchingFishParcelableFAB;
        r6 = r4.CatchingFishSnackbar;
        r8 = r4.CatchingFishCoroutine;
        r4.CatchingFishCoroutine(r3);
        r3 = r4.CatchingFishParcelableFAB;
        r9 = r4.CatchingFishSnackbar;
        r10 = r4.CatchingFishCoroutine;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0213, code lost:
    
        if (r11 >= r8) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0223, code lost:
    
        if (((r5[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= 128) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0225, code lost:
    
        r14 = r6[r11];
        r16 = java.lang.Long.hashCode(r14) * r29;
        r16 = r16 ^ (r16 << 16);
        r17 = r3;
        r3 = r4.CatchingFishSnackbar(r16 >>> 7);
        r3 = r16 & 127;
        r16 = r5;
        r19 = r6;
        r5 = r3;
        r3 = r3 >> 3;
        r20 = (r3 & 7) << 3;
        r5 = (r17[r3] & (~(255 << r20))) | (r5 << r20);
        r17[r3] = r5;
        r17[(((r3 - 7) & r10) + (r10 & 7)) >> 3] = r5;
        r9[r3] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026b, code lost:
    
        r11 = r11 + 1;
        r5 = r16;
        r3 = r17;
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0265, code lost:
    
        r17 = r3;
        r16 = r5;
        r19 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ca, code lost:
    
        r27 = 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23, types: [int] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishViewModelScope(KeyEvent keyEvent) {
        int i;
        boolean z;
        int i2;
        long CatchingFishCoroutine = CatchingFishGsonCardView.CatchingFishCoroutine(keyEvent.getKeyCode());
        int action = keyEvent.getAction();
        boolean z2 = true;
        char c = action != 0 ? action != 1 ? (char) 0 : (char) 1 : (char) 2;
        int i3 = -862048943;
        long j = -9187201950435737472L;
        if (c == 2) {
            CatchingFishGlideXMLLayout catchingFishGlideXMLLayout = this.CatchingFishWorkManager;
            if (catchingFishGlideXMLLayout == null) {
                catchingFishGlideXMLLayout = new CatchingFishGlideXMLLayout(3);
                this.CatchingFishWorkManager = catchingFishGlideXMLLayout;
            }
            CatchingFishGlideXMLLayout catchingFishGlideXMLLayout2 = catchingFishGlideXMLLayout;
            int hashCode = Long.hashCode(CatchingFishCoroutine) * (-862048943);
            int i4 = hashCode ^ (hashCode << 16);
            int i5 = i4 >>> 7;
            int i6 = i4 & 127;
            int i7 = catchingFishGlideXMLLayout2.CatchingFishCoroutine;
            int i8 = i5 & i7;
            int i9 = 0;
            loop0: while (true) {
                long[] jArr = catchingFishGlideXMLLayout2.CatchingFishParcelableFAB;
                int i10 = i8 >> 3;
                int i11 = (i8 & 7) << 3;
                long j2 = (jArr[i10] >>> i11) | ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63));
                int i12 = i3;
                long j3 = i6;
                boolean z3 = z2;
                long j4 = j2 ^ (j3 * 72340172838076673L);
                long j5 = (j4 - 72340172838076673L) & (~j4) & (-9187201950435737472L);
                while (true) {
                    if (j5 == 0) {
                        break;
                    }
                    i2 = (i8 + (Long.numberOfTrailingZeros(j5) >> 3)) & i7;
                    z = z3;
                    if (catchingFishGlideXMLLayout2.CatchingFishSnackbar[i2] == CatchingFishCoroutine) {
                        break loop0;
                    }
                    j5 &= j5 - 1;
                    z3 = z;
                }
                i9 += 8;
                i8 = (i8 + i9) & i7;
                i3 = i12;
                z2 = z;
            }
            catchingFishGlideXMLLayout2.CatchingFishSnackbar[i2] = CatchingFishCoroutine;
            return z;
        }
        if (c != 1) {
            return true;
        }
        CatchingFishGlideXMLLayout catchingFishGlideXMLLayout3 = this.CatchingFishWorkManager;
        if (catchingFishGlideXMLLayout3 == null || !catchingFishGlideXMLLayout3.CatchingFishParcelableFAB(CatchingFishCoroutine)) {
            return false;
        }
        CatchingFishGlideXMLLayout catchingFishGlideXMLLayout4 = this.CatchingFishWorkManager;
        if (catchingFishGlideXMLLayout4 != null) {
            int hashCode2 = Long.hashCode(CatchingFishCoroutine) * (-862048943);
            int i13 = hashCode2 ^ (hashCode2 << 16);
            int i14 = i13 & 127;
            int i15 = catchingFishGlideXMLLayout4.CatchingFishCoroutine;
            int i16 = (i13 >>> 7) & i15;
            int i17 = 0;
            loop5: while (true) {
                long[] jArr2 = catchingFishGlideXMLLayout4.CatchingFishParcelableFAB;
                int i18 = i16 >> 3;
                int i19 = (i16 & 7) << 3;
                long j6 = j;
                long j7 = ((jArr2[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr2[i18] >>> i19);
                long j8 = (i14 * 72340172838076673L) ^ j7;
                long j9 = (~j8) & (j8 - 72340172838076673L) & j6;
                while (true) {
                    if (j9 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j9) >> 3) + i16) & i15;
                    if (catchingFishGlideXMLLayout4.CatchingFishSnackbar[i] == CatchingFishCoroutine) {
                        break loop5;
                    }
                    j9 &= j9 - 1;
                }
                i17 += 8;
                i16 = (i16 + i17) & i15;
                j = j6;
            }
            if (i >= 0) {
                catchingFishGlideXMLLayout4.CatchingFishReduxKtor--;
                long[] jArr3 = catchingFishGlideXMLLayout4.CatchingFishParcelableFAB;
                int i20 = catchingFishGlideXMLLayout4.CatchingFishCoroutine;
                int i21 = i >> 3;
                int i22 = (i & 7) << 3;
                long j10 = (jArr3[i21] & (~(255 << i22))) | (254 << i22);
                jArr3[i21] = j10;
                jArr3[(((i - 7) & i20) + (i20 & 7)) >> 3] = j10;
                return true;
            }
        }
        return true;
    }

    public final void CatchingFishWorkManager(CatchingFishAppCompatWidget catchingFishAppCompatWidget) {
        CatchingFishBiometricRoom CatchingFishJobScheduler;
        CatchingFishMVPMotionLayout CatchingFish;
        CatchingFishBiometricRoom CatchingFishJobScheduler2;
        CatchingFishMVPMotionLayout CatchingFish2;
        CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = this.CatchingFishViewModelFAB;
        this.CatchingFishViewModelFAB = catchingFishAppCompatWidget;
        CatchingFishBundleGradle catchingFishBundleGradle = this.CatchingFishViewModelScope;
        Object[] objArr = catchingFishBundleGradle.CatchingFishParcelableFAB;
        int i = catchingFishBundleGradle.CatchingFishSnackbar;
        for (int i2 = 0; i2 < i; i2++) {
            CatchingFishDataStoreMVVM catchingFishDataStoreMVVM = (CatchingFishDataStoreMVVM) objArr[i2];
            catchingFishDataStoreMVVM.getClass();
            if (catchingFishAppCompatWidget2 != null && (CatchingFishJobScheduler2 = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget2)) != null && (CatchingFish2 = CatchingFishJobScheduler2.CatchingFish()) != null && CatchingFish2.CatchingFishReduxKtor.CatchingFishSnackbar(CatchingFishViewStripeAPI.CatchingFishWorkManager)) {
                ((AutofillManager) catchingFishDataStoreMVVM.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket).notifyViewExited(catchingFishDataStoreMVVM.CatchingFishCoroutine, CatchingFishJobScheduler2.CatchingFishDaggerWebsocket);
            }
            if (catchingFishAppCompatWidget != null && (CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget)) != null && (CatchingFish = CatchingFishJobScheduler.CatchingFish()) != null && CatchingFish.CatchingFishReduxKtor.CatchingFishSnackbar(CatchingFishViewStripeAPI.CatchingFishWorkManager)) {
                int i3 = CatchingFishJobScheduler.CatchingFishDaggerWebsocket;
                catchingFishDataStoreMVVM.CatchingFishReduxKtor.CatchingFishParcelableFAB.CatchingFishViewModelFAB(i3, new CatchingFishMVPAdMob(catchingFishDataStoreMVVM, i3));
            }
        }
    }
}
