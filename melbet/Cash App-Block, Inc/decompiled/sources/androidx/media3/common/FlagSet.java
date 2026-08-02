package androidx.media3.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ToolbarActionBar;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import androidx.camera.core.impl.CameraValidatorImpl$ValidationCriteria;
import androidx.core.graphics.Insets;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.ui.PlayerView;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.engine.Resource;
import com.fillr.e0;
import com.fillr.m1;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzlo;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzub;
import com.google.android.gms.tasks.zzb;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import com.squareup.cash.biometrics.CashBiometricsInfo;
import com.squareup.cash.blockers.presenters.AppLockEndpoint$WhenMappings;
import com.squareup.cash.blockers.presenters.AppLockEndpoint$call$1;
import com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint;
import com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint$Request$Fingerprint;
import com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint$Request$Passcode;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.overlays.FakeOverlayLayerKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.janus.api.PasscodeService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SetAppLockActivatedRequest;
import com.squareup.protos.franklin.app.SetAppLockActivatedResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.internal.StringOpsKt;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.brotli.dec.HuffmanTreeGroup;
import org.commonmark.internal.BlockContent;
import papa.SafeTrace;
import retrofit2.Response;
import retrofit2.adapter.rxjava3.HttpException;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class FlagSet {
    public final SparseBooleanArray flags;

    public FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.flags = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlagSet) {
            return this.flags.equals(((FlagSet) obj).flags);
        }
        return false;
    }

    public final int get(int i) {
        SparseBooleanArray sparseBooleanArray = this.flags;
        Trace.checkElementIndex(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final int hashCode() {
        return this.flags.hashCode();
    }

    public class Builder implements MenuPresenter.Callback, ViewUtils.OnApplyWindowInsetsListener, zzoa, zzub, PasscodeGatedEndpoint, Observer {
        public final /* synthetic */ int $r8$classId;
        public boolean buildCalled;
        public Object flags;

        public Builder(Context context, CameraSelector cameraSelector) {
            this.$r8$classId = 2;
            context.getClass();
            boolean z = false;
            this.buildCalled = Build.VERSION.SDK_INT >= 34 && PlayerView.Api34.getDeviceId(context) != 0;
            PackageManager packageManager = context.getPackageManager();
            Integer lensFacing = cameraSelector != null ? cameraSelector.getLensFacing() : null;
            boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
            boolean hasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
            boolean z2 = hasSystemFeature && (lensFacing == null || lensFacing.intValue() == 1);
            if (hasSystemFeature2 && (lensFacing == null || lensFacing.intValue() == 0)) {
                z = true;
            }
            this.flags = new CameraValidatorImpl$ValidationCriteria(z2, z);
        }

        public static boolean hasCamera(Set set, CameraSelector cameraSelector) {
            try {
                cameraSelector.select(new LinkedHashSet(set));
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        public void add(int i) {
            Trace.checkState(!this.buildCalled);
            ((SparseBooleanArray) this.flags).append(i, true);
        }

        public FlagSet build() {
            Trace.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new FlagSet((SparseBooleanArray) this.flags);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object call(PasscodeService passcodeService, AppService appService, FakeOverlayLayerKt fakeOverlayLayerKt, ContinuationImpl continuationImpl) {
            AppLockEndpoint$call$1 appLockEndpoint$call$1;
            int i;
            SetAppLockActivatedRequest copy$default;
            ApiResult apiResult;
            if (continuationImpl instanceof AppLockEndpoint$call$1) {
                appLockEndpoint$call$1 = (AppLockEndpoint$call$1) continuationImpl;
                int i2 = appLockEndpoint$call$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    appLockEndpoint$call$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = appLockEndpoint$call$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = appLockEndpoint$call$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        SetAppLockActivatedRequest setAppLockActivatedRequest = new SetAppLockActivatedRequest(fakeOverlayLayerKt.getRequestContext(), Boolean.valueOf(this.buildCalled), null, null, ByteString.EMPTY);
                        if (fakeOverlayLayerKt instanceof PasscodeGatedEndpoint$Request$Fingerprint) {
                            copy$default = SetAppLockActivatedRequest.copy$default(setAppLockActivatedRequest, null, null, ((PasscodeGatedEndpoint$Request$Fingerprint) fakeOverlayLayerKt).token, null, 23);
                        } else {
                            if (!(fakeOverlayLayerKt instanceof PasscodeGatedEndpoint$Request$Passcode)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            copy$default = SetAppLockActivatedRequest.copy$default(setAppLockActivatedRequest, null, ((PasscodeGatedEndpoint$Request$Passcode) fakeOverlayLayerKt).passcode, null, null, 27);
                        }
                        appLockEndpoint$call$1.label = 1;
                        obj = appService.setAppLockActivated(copy$default, appLockEndpoint$call$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Success) {
                        if (apiResult instanceof ApiResult.Failure) {
                            return new PasscodeGatedEndpoint.Response.Failure((ApiResult.Failure) apiResult);
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    SetAppLockActivatedResponse setAppLockActivatedResponse = (SetAppLockActivatedResponse) ((ApiResult.Success) apiResult).response;
                    SetAppLockActivatedResponse.Status status = setAppLockActivatedResponse.status;
                    int i3 = status == null ? -1 : AppLockEndpoint$WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                    return i3 != 1 ? (i3 == 2 || i3 == 3) ? PasscodeGatedEndpoint.Response.InvalidPasscodeOrToken.INSTANCE : i3 != 4 ? new PasscodeGatedEndpoint.Response.ServiceLevelError(setAppLockActivatedResponse.response_context) : new PasscodeGatedEndpoint.Response.TooManyAttempts(setAppLockActivatedResponse.response_context) : new PasscodeGatedEndpoint.Response.Success(setAppLockActivatedResponse.passcode_token, setAppLockActivatedResponse.response_context);
                }
            }
            appLockEndpoint$call$1 = new AppLockEndpoint$call$1(this, continuationImpl);
            Object obj3 = appLockEndpoint$call$1.result;
            Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = appLockEndpoint$call$1.label;
            if (i != 0) {
            }
            apiResult = (ApiResult) obj3;
            if (apiResult instanceof ApiResult.Success) {
            }
        }

        public boolean defaultIsRtl() {
            return this.buildCalled;
        }

        public boolean isChangeInvalid(LinkedHashSet linkedHashSet, Set set) {
            CameraValidatorImpl$ValidationCriteria cameraValidatorImpl$ValidationCriteria = (CameraValidatorImpl$ValidationCriteria) this.flags;
            set.getClass();
            if (!this.buildCalled) {
                boolean z = cameraValidatorImpl$ValidationCriteria.checkBack;
                boolean z2 = cameraValidatorImpl$ValidationCriteria.checkFront;
                if (z || z2) {
                    CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
                    cameraSelector.getClass();
                    boolean hasCamera = hasCamera(linkedHashSet, cameraSelector);
                    CameraSelector cameraSelector2 = CameraSelector.DEFAULT_FRONT_CAMERA;
                    cameraSelector2.getClass();
                    boolean hasCamera2 = hasCamera(linkedHashSet, cameraSelector2);
                    Set set2 = set;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((CameraIdentifier) it.next()).getInternalId());
                    }
                    Set set3 = CollectionsKt.toSet(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : linkedHashSet) {
                        if (!set3.contains(((CameraInternal) obj).getCameraInfoInternal().getCameraId())) {
                            arrayList2.add(obj);
                        }
                    }
                    Set set4 = CollectionsKt.toSet(arrayList2);
                    CameraSelector cameraSelector3 = CameraSelector.DEFAULT_BACK_CAMERA;
                    cameraSelector3.getClass();
                    boolean hasCamera3 = hasCamera(set4, cameraSelector3);
                    CameraSelector cameraSelector4 = CameraSelector.DEFAULT_FRONT_CAMERA;
                    cameraSelector4.getClass();
                    boolean hasCamera4 = hasCamera(set4, cameraSelector4);
                    boolean z3 = cameraValidatorImpl$ValidationCriteria.checkBack && hasCamera && !hasCamera3;
                    boolean z4 = z2 && hasCamera2 && !hasCamera4;
                    if (z3 || z4) {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean isRtl(int i, CharSequence charSequence) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                return false;
            }
            if (((TextDirectionHeuristicsCompat.FirstStrong) this.flags) == null) {
                return defaultIsRtl();
            }
            char c = 2;
            for (int i2 = 0; i2 < i && c == 2; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                Builder builder = TextDirectionHeuristicsCompat.LTR;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c = 2;
                                break;
                        }
                    }
                    c = 0;
                }
                c = 1;
            }
            if (c == 0) {
                return true;
            }
            if (c != 1) {
                return defaultIsRtl();
            }
            return false;
        }

        public void nextItem() {
            this.buildCalled = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
            boolean z;
            boolean z2;
            WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
            Insets insets = impl.getInsets(519);
            Insets insets2 = impl.getInsets(32);
            BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.flags;
            int i = insets.top;
            int i2 = insets.right;
            int i3 = insets.left;
            bottomSheetBehavior.insetTop = i;
            boolean isLayoutRtl = ViewUtils.isLayoutRtl(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            boolean z3 = bottomSheetBehavior.paddingBottomSystemWindowInsets;
            if (z3) {
                int systemWindowInsetBottom = windowInsetsCompat.getSystemWindowInsetBottom();
                bottomSheetBehavior.insetBottom = systemWindowInsetBottom;
                paddingBottom = systemWindowInsetBottom + relativePadding.bottom;
            }
            if (bottomSheetBehavior.paddingLeftSystemWindowInsets) {
                paddingLeft = (isLayoutRtl ? relativePadding.end : relativePadding.start) + i3;
            }
            if (bottomSheetBehavior.paddingRightSystemWindowInsets) {
                paddingRight = (isLayoutRtl ? relativePadding.start : relativePadding.end) + i2;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z4 = true;
            if (!bottomSheetBehavior.marginLeftSystemWindowInsets || marginLayoutParams.leftMargin == i3) {
                z = false;
            } else {
                marginLayoutParams.leftMargin = i3;
                z = true;
            }
            if (bottomSheetBehavior.marginRightSystemWindowInsets && marginLayoutParams.rightMargin != i2) {
                marginLayoutParams.rightMargin = i2;
                z = true;
            }
            if (bottomSheetBehavior.marginTopSystemWindowInsets) {
                int i4 = marginLayoutParams.topMargin;
                int i5 = insets.top;
                if (i4 != i5) {
                    marginLayoutParams.topMargin = i5;
                    if (z4) {
                        view.setLayoutParams(marginLayoutParams);
                    }
                    view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                    z2 = this.buildCalled;
                    if (z2) {
                        bottomSheetBehavior.gestureInsetBottom = insets2.bottom;
                    }
                    if (z3 && !z2) {
                        return windowInsetsCompat;
                    }
                    bottomSheetBehavior.updatePeekHeight();
                    return windowInsetsCompat;
                }
            }
            z4 = z;
            if (z4) {
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            z2 = this.buildCalled;
            if (z2) {
            }
            if (z3) {
            }
            bottomSheetBehavior.updatePeekHeight();
            return windowInsetsCompat;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            ActionMenuPresenter actionMenuPresenter;
            ToolbarActionBar toolbarActionBar = (ToolbarActionBar) this.flags;
            if (this.buildCalled) {
                return;
            }
            this.buildCalled = true;
            ActionMenuView actionMenuView = toolbarActionBar.mDecorToolbar.mToolbar.mMenuView;
            if (actionMenuView != null && (actionMenuPresenter = actionMenuView.mPresenter) != null) {
                actionMenuPresenter.hideOverflowMenu();
                ActionMenuPresenter.OverflowPopup overflowPopup = actionMenuPresenter.mActionButtonPopup;
                if (overflowPopup != null && overflowPopup.isShowing()) {
                    overflowPopup.mPopup.dismiss();
                }
            }
            toolbarActionBar.mWindowCallback.onPanelClosed(108, menuBuilder);
            this.buildCalled = false;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            if (this.buildCalled) {
                return;
            }
            ((Observer) this.flags).onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
            if (!this.buildCalled) {
                ((Observer) this.flags).onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            UnsignedBytes.onError(assertionError);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(Object obj) {
            Response response = (Response) obj;
            Observer observer = (Observer) this.flags;
            if (response.rawResponse.isSuccessful) {
                observer.onNext(response.body);
                return;
            }
            this.buildCalled = true;
            HttpException httpException = new HttpException(response);
            try {
                observer.onError(httpException);
            } catch (Throwable th) {
                Longs.throwIfFatal(th);
                UnsignedBytes.onError(new CompositeException(httpException, th));
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            ((ToolbarActionBar) this.flags).mWindowCallback.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            ((Observer) this.flags).onSubscribe(disposable);
        }

        public void print(char c) {
            BlockContent blockContent = (BlockContent) this.flags;
            blockContent.ensureTotalCapacity(blockContent.lineCount, 1);
            char[] cArr = (char[]) blockContent.sb;
            int i = blockContent.lineCount;
            blockContent.lineCount = i + 1;
            cArr[i] = c;
        }

        public void printQuoted(String str) {
            int i;
            str.getClass();
            BlockContent blockContent = (BlockContent) this.flags;
            blockContent.ensureTotalCapacity(blockContent.lineCount, str.length() + 2);
            char[] cArr = (char[]) blockContent.sb;
            int i2 = blockContent.lineCount;
            int i3 = i2 + 1;
            cArr[i2] = '\"';
            int length = str.length();
            str.getChars(0, length, cArr, i3);
            int i4 = length + i3;
            int i5 = i3;
            while (i5 < i4) {
                char c = cArr[i5];
                byte[] bArr = StringOpsKt.ESCAPE_MARKERS;
                if (c < bArr.length && bArr[c] != 0) {
                    int length2 = str.length();
                    for (int i6 = i5 - i3; i6 < length2; i6++) {
                        blockContent.ensureTotalCapacity(i5, 2);
                        char charAt = str.charAt(i6);
                        byte[] bArr2 = StringOpsKt.ESCAPE_MARKERS;
                        if (charAt < bArr2.length) {
                            byte b = bArr2[charAt];
                            if (b == 0) {
                                i = i5 + 1;
                                ((char[]) blockContent.sb)[i5] = charAt;
                            } else {
                                if (b == 1) {
                                    String str2 = StringOpsKt.ESCAPE_STRINGS[charAt];
                                    str2.getClass();
                                    blockContent.ensureTotalCapacity(i5, str2.length());
                                    str2.getChars(0, str2.length(), (char[]) blockContent.sb, i5);
                                    int length3 = str2.length() + i5;
                                    blockContent.lineCount = length3;
                                    i5 = length3;
                                } else {
                                    char[] cArr2 = (char[]) blockContent.sb;
                                    cArr2[i5] = '\\';
                                    cArr2[i5 + 1] = (char) b;
                                    i5 += 2;
                                    blockContent.lineCount = i5;
                                }
                            }
                        } else {
                            i = i5 + 1;
                            ((char[]) blockContent.sb)[i5] = charAt;
                        }
                        i5 = i;
                    }
                    blockContent.ensureTotalCapacity(i5, 1);
                    ((char[]) blockContent.sb)[i5] = '\"';
                    blockContent.lineCount = i5 + 1;
                    return;
                }
                i5++;
            }
            cArr[i4] = '\"';
            blockContent.lineCount = i4 + 1;
        }

        @Override // com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint
        public PasscodeViewModel.VerifyPasscodeModel.BiometricsPrompt promptModel(AndroidStringManager androidStringManager) {
            androidStringManager.getClass();
            return new PasscodeViewModel.VerifyPasscodeModel.BiometricsPrompt(((CashBiometricsInfo) this.flags).changeSettings);
        }

        public synchronized void recycle(Resource resource, boolean z) {
            try {
                if (!this.buildCalled && !z) {
                    this.buildCalled = true;
                    resource.recycle();
                    this.buildCalled = false;
                }
                ((Handler) this.flags).obtainMessage(1, resource).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }

        public void space() {
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 11:
                    return this.buildCalled ? "FALL_THROUGH" : String.valueOf(this.flags);
                default:
                    return super.toString();
            }
        }

        public void unIndent() {
        }

        public void validateOnFirstInit(CameraRepository cameraRepository) {
            CameraValidatorImpl$ValidationCriteria cameraValidatorImpl$ValidationCriteria = (CameraValidatorImpl$ValidationCriteria) this.flags;
            cameraRepository.getClass();
            if (this.buildCalled) {
                StringUtilsKt.d("CameraValidator", "Virtual device with " + cameraRepository.getCameras().size() + " cameras. Skipping validation.");
                return;
            }
            StringUtilsKt.d("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE);
            if (cameraValidatorImpl$ValidationCriteria.checkBack) {
                try {
                    CameraSelector.DEFAULT_BACK_CAMERA.select(cameraRepository.getCameras()).getClass();
                } catch (RuntimeException e) {
                    e = e;
                    StringUtilsKt.w("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
                }
            }
            e = null;
            if (cameraValidatorImpl$ValidationCriteria.checkFront) {
                try {
                    CameraSelector.DEFAULT_FRONT_CAMERA.select(cameraRepository.getCameras()).getClass();
                } catch (RuntimeException e2) {
                    StringUtilsKt.w("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e2);
                    if (e == null) {
                        e = e2;
                    }
                }
            }
            if (e != null) {
                throw new CameraValidator$CameraIdListIncorrectException(cameraRepository.getCameras().size(), e);
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
        public HuffmanTreeGroup zza$6() {
            boolean z = this.buildCalled;
            zzks zzksVar = (zzks) this.flags;
            e0 e0Var = new e0(19);
            e0Var.c = z ? zzkr.TYPE_THICK : zzkr.TYPE_THIN;
            m1 m1Var = new m1(24, false);
            m1Var.a = zzksVar;
            e0Var.f = new zzlo(m1Var);
            return new HuffmanTreeGroup(e0Var, 0);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
        public HuffmanTreeGroup zza$9() {
            e0 e0Var = new e0(20);
            zzot zzotVar = this.buildCalled ? zzot.TYPE_THICK : zzot.TYPE_THIN;
            zzou zzouVar = (zzou) this.flags;
            e0Var.c = zzotVar;
            zzb zzbVar = new zzb(20);
            zzbVar.zza = zzouVar;
            e0Var.f = new zzrw(zzbVar);
            return new HuffmanTreeGroup(e0Var, 0, (byte) 0);
        }

        public void print(String str) {
            str.getClass();
            ((BlockContent) this.flags).write(str);
        }

        public void print(byte b) {
            ((BlockContent) this.flags).write(String.valueOf(b));
        }

        public void print(short s) {
            ((BlockContent) this.flags).write(String.valueOf(s));
        }

        public void print(int i) {
            ((BlockContent) this.flags).write(String.valueOf(i));
        }

        public void print(long j) {
            ((BlockContent) this.flags).write(String.valueOf(j));
        }

        public /* synthetic */ Builder(Object obj, boolean z, int i) {
            this.$r8$classId = i;
            this.flags = obj;
            this.buildCalled = z;
        }

        public /* synthetic */ Builder(boolean z, Enum r2, int i) {
            this.$r8$classId = i;
            this.buildCalled = z;
            this.flags = r2;
        }

        public Builder(BlockContent blockContent) {
            this.$r8$classId = 12;
            this.flags = blockContent;
            this.buildCalled = true;
        }

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 5:
                    this.flags = new Handler(Looper.getMainLooper(), new BaseTransientBottomBar.AnonymousClass1(1));
                    break;
                case 6:
                    break;
                default:
                    this.flags = new SparseBooleanArray();
                    break;
            }
        }

        public /* synthetic */ Builder(Object obj, int i) {
            this.$r8$classId = i;
            this.flags = obj;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(TextDirectionHeuristicsCompat.FirstStrong firstStrong, boolean z) {
            this(firstStrong, 4);
            this.$r8$classId = 4;
            this.buildCalled = z;
        }
    }
}
