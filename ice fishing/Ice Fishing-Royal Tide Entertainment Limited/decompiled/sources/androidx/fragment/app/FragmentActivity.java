package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.text.CatchingFishFABLifecycle;
import kotlin.text.CatchingFishGoogleMapsMoshi;
import kotlin.text.CatchingFishGsonAsyncTask;
import kotlin.text.CatchingFishKtorKtorPayPal;
import kotlin.text.CatchingFishMVIPicasso;
import kotlin.text.CatchingFishMVVMWidget;
import kotlin.text.CatchingFishMockkFirebase;
import kotlin.text.CatchingFishServiceHilt;
import kotlin.text.CatchingFishServiceWidget;
import kotlin.text.CatchingFishSnackbarFlux;
import kotlin.text.CatchingFishToastSharedFlow;
import kotlin.text.CatchingFishToolbarLiveData;
import kotlin.text.CatchingFishToolbarToast;
import kotlin.text.CatchingFishViewCardView;
import kotlin.text.CatchingFishViewModelIntent;
import kotlin.text.CatchingFishViewPagerMockk;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements CatchingFishMVVMWidget {
    public static final /* synthetic */ int CatchingFishCustomView = 0;
    public boolean CatchingFishCardViewView;
    public boolean CatchingFishPayPal;
    public final CatchingFishViewPagerMockk CatchingFishGsonAppCompat = new CatchingFishViewPagerMockk(10, new CatchingFishMVIPicasso(this));
    public final CatchingFishToolbarToast CatchingFishCardViewRealm = new CatchingFishToolbarToast(this);
    public boolean CatchingFishMVPRobolectric = true;

    public FragmentActivity() {
        ((CatchingFishViewModelIntent) this.CatchingFishViewModelScope.CatchingFishWorkManager).CatchingFishCardViewRealm("android:support:lifecycle", new CatchingFishViewCardView(2, this));
        final int i = 0;
        CatchingFishViewModelScope(new CatchingFishKtorKtorPayPal(this) { // from class: kotlin.text.CatchingFishLiveDataLayout
            public final /* synthetic */ FragmentActivity CatchingFishSnackbar;

            {
                this.CatchingFishSnackbar = this;
            }

            @Override // kotlin.text.CatchingFishKtorKtorPayPal
            public final void accept(Object obj) {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        this.CatchingFishSnackbar.CatchingFishGsonAppCompat.CatchingFishAnimationMockk();
                        break;
                    default:
                        this.CatchingFishSnackbar.CatchingFishGsonAppCompat.CatchingFishAnimationMockk();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.CatchingFishAnimationMockk.add(new CatchingFishKtorKtorPayPal(this) { // from class: kotlin.text.CatchingFishLiveDataLayout
            public final /* synthetic */ FragmentActivity CatchingFishSnackbar;

            {
                this.CatchingFishSnackbar = this;
            }

            @Override // kotlin.text.CatchingFishKtorKtorPayPal
            public final void accept(Object obj) {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        this.CatchingFishSnackbar.CatchingFishGsonAppCompat.CatchingFishAnimationMockk();
                        break;
                    default:
                        this.CatchingFishSnackbar.CatchingFishGsonAppCompat.CatchingFishAnimationMockk();
                        break;
                }
            }
        });
        CatchingFishViewModelFAB(new CatchingFishFABLifecycle(this, 1));
    }

    public static boolean CatchingFishEspressoTesting(CatchingFishToastSharedFlow catchingFishToastSharedFlow) {
        boolean z = false;
        for (CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi : catchingFishToastSharedFlow.CatchingFishCoroutine.CatchingFishStateLiveData()) {
            if (catchingFishGoogleMapsMoshi != null) {
                CatchingFishMVIPicasso catchingFishMVIPicasso = catchingFishGoogleMapsMoshi.CatchingFishDaggerHiltFAB;
                if ((catchingFishMVIPicasso == null ? null : catchingFishMVIPicasso.CatchingFishParcelableFlux) != null) {
                    z |= CatchingFishEspressoTesting(catchingFishGoogleMapsMoshi.CatchingFishViewModelScope());
                }
                CatchingFishServiceWidget catchingFishServiceWidget = catchingFishGoogleMapsMoshi.CatchingFishLayoutInflater;
                CatchingFishMockkFirebase catchingFishMockkFirebase = CatchingFishMockkFirebase.CatchingFishViewModelScope;
                if (catchingFishServiceWidget != null) {
                    catchingFishServiceWidget.CatchingFishWorkManager();
                    if (catchingFishServiceWidget.CatchingFishWorkManager.CatchingFishReduxKtor.compareTo(catchingFishMockkFirebase) >= 0) {
                        catchingFishGoogleMapsMoshi.CatchingFishLayoutInflater.CatchingFishWorkManager.CatchingFishViewModelScope();
                        z = true;
                    }
                }
                if (catchingFishGoogleMapsMoshi.CatchingFishMotionLayout.CatchingFishReduxKtor.compareTo(catchingFishMockkFirebase) >= 0) {
                    catchingFishGoogleMapsMoshi.CatchingFishMotionLayout.CatchingFishViewModelScope();
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.CatchingFishPayPal);
        printWriter.print(" mResumed=");
        printWriter.print(this.CatchingFishCardViewView);
        printWriter.print(" mStopped=");
        printWriter.print(this.CatchingFishMVPRobolectric);
        if (getApplication() != null) {
            CatchingFishGsonAsyncTask catchingFishGsonAsyncTask = ((CatchingFishSnackbarFlux) new CatchingFishServiceHilt(CatchingFishReduxKtor(), CatchingFishSnackbarFlux.CatchingFishCoroutine).CatchingFishCoroutineFlow(CatchingFishSnackbarFlux.class)).CatchingFishSnackbar;
            if (catchingFishGsonAsyncTask.CatchingFishWorkManager > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (catchingFishGsonAsyncTask.CatchingFishWorkManager > 0) {
                    if (catchingFishGsonAsyncTask.CatchingFishDaggerWebsocket(0) != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(catchingFishGsonAsyncTask.CatchingFishReduxKtor[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((CatchingFishMVIPicasso) this.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget.CatchingFishDaggerHiltFAB(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.CatchingFishGsonAppCompat.CatchingFishAnimationMockk();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.CatchingFishCardViewRealm.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_CREATE);
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = ((CatchingFishMVIPicasso) this.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget;
        catchingFishToastSharedFlow.CatchingFishFragmentFactory = false;
        catchingFishToastSharedFlow.CatchingFishMutableLiveData = false;
        catchingFishToastSharedFlow.CatchingFishCameraXIntent.CatchingFishViewModelScope = false;
        catchingFishToastSharedFlow.CatchingFishJetpackCompose(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((CatchingFishMVIPicasso) this.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget.CatchingFishWorkManager.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((CatchingFishMVIPicasso) this.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget.CatchingFishCloudMessaging();
        this.CatchingFishCardViewRealm.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((CatchingFishMVIPicasso) this.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget.CatchingFishLayout();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.CatchingFishCardViewView = false;
        ((CatchingFishMVIPicasso) this.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget.CatchingFishJetpackCompose(5);
        this.CatchingFishCardViewRealm.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.CatchingFishCardViewRealm.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_RESUME);
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = ((CatchingFishMVIPicasso) this.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget;
        catchingFishToastSharedFlow.CatchingFishFragmentFactory = false;
        catchingFishToastSharedFlow.CatchingFishMutableLiveData = false;
        catchingFishToastSharedFlow.CatchingFishCameraXIntent.CatchingFishViewModelScope = false;
        catchingFishToastSharedFlow.CatchingFishJetpackCompose(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.CatchingFishGsonAppCompat.CatchingFishAnimationMockk();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = this.CatchingFishGsonAppCompat;
        catchingFishViewPagerMockk.CatchingFishAnimationMockk();
        super.onResume();
        this.CatchingFishCardViewView = true;
        ((CatchingFishMVIPicasso) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget.CatchingFishGsonAppCompat(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = this.CatchingFishGsonAppCompat;
        catchingFishViewPagerMockk.CatchingFishAnimationMockk();
        CatchingFishMVIPicasso catchingFishMVIPicasso = (CatchingFishMVIPicasso) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket;
        super.onStart();
        this.CatchingFishMVPRobolectric = false;
        if (!this.CatchingFishPayPal) {
            this.CatchingFishPayPal = true;
            CatchingFishToastSharedFlow catchingFishToastSharedFlow = catchingFishMVIPicasso.CatchingFishSpannableWidget;
            catchingFishToastSharedFlow.CatchingFishFragmentFactory = false;
            catchingFishToastSharedFlow.CatchingFishMutableLiveData = false;
            catchingFishToastSharedFlow.CatchingFishCameraXIntent.CatchingFishViewModelScope = false;
            catchingFishToastSharedFlow.CatchingFishJetpackCompose(4);
        }
        catchingFishMVIPicasso.CatchingFishSpannableWidget.CatchingFishGsonAppCompat(true);
        this.CatchingFishCardViewRealm.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_START);
        CatchingFishToastSharedFlow catchingFishToastSharedFlow2 = catchingFishMVIPicasso.CatchingFishSpannableWidget;
        catchingFishToastSharedFlow2.CatchingFishFragmentFactory = false;
        catchingFishToastSharedFlow2.CatchingFishMutableLiveData = false;
        catchingFishToastSharedFlow2.CatchingFishCameraXIntent.CatchingFishViewModelScope = false;
        catchingFishToastSharedFlow2.CatchingFishJetpackCompose(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.CatchingFishGsonAppCompat.CatchingFishAnimationMockk();
    }

    @Override // android.app.Activity
    public void onStop() {
        CatchingFishViewPagerMockk catchingFishViewPagerMockk;
        super.onStop();
        this.CatchingFishMVPRobolectric = true;
        do {
            catchingFishViewPagerMockk = this.CatchingFishGsonAppCompat;
        } while (CatchingFishEspressoTesting(((CatchingFishMVIPicasso) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget));
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = ((CatchingFishMVIPicasso) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget;
        catchingFishToastSharedFlow.CatchingFishMutableLiveData = true;
        catchingFishToastSharedFlow.CatchingFishCameraXIntent.CatchingFishViewModelScope = true;
        catchingFishToastSharedFlow.CatchingFishJetpackCompose(4);
        this.CatchingFishCardViewRealm.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((CatchingFishMVIPicasso) this.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget.CatchingFishWorkManager.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
