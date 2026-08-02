package androidx.core.view.insets;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.appcompat.widget.SearchView;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder;
import androidx.core.graphics.Insets;
import androidx.core.splashscreen.SplashScreen$Impl$setOnExitAnimationListener$2;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.extractor.VorbisUtil$Mode;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import coil3.request.Disposable;
import com.google.android.gms.internal.measurement.zzabh;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.maps.android.compose.MapLifecycleEventObserver;
import com.squareup.cash.directory_ui.views.MooncakeHeaderView;
import com.squareup.cash.tax.views.TaxWebAppView;
import com.squareup.util.android.Views;
import com.squareup.util.android.Views$waitForMeasure$attachListener$1$listener$1;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepBottomSheetBinding;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes3.dex */
public final class SystemBarStateMonitor {
    public final ArrayList mCallbacks = new ArrayList();
    public int mColorHint;
    public final AnonymousClass1 mDetector;
    public Insets mInsets;
    public Insets mInsetsIgnoringVisibility;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, androidx.core.view.insets.SystemBarStateMonitor$1, java.lang.Object] */
    public SystemBarStateMonitor(final ViewGroup viewGroup) {
        View view;
        Insets insets = Insets.NONE;
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets;
        Drawable background = viewGroup.getBackground();
        int i = 0;
        this.mColorHint = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        ?? r0 = new View(viewGroup.getContext()) { // from class: androidx.core.view.insets.SystemBarStateMonitor.1
            @Override // android.view.View
            public final void onConfigurationChanged(Configuration configuration) {
                SystemBarStateMonitor systemBarStateMonitor = SystemBarStateMonitor.this;
                ArrayList arrayList = systemBarStateMonitor.mCallbacks;
                Drawable background2 = viewGroup.getBackground();
                int color = background2 instanceof ColorDrawable ? ((ColorDrawable) background2).getColor() : 0;
                if (systemBarStateMonitor.mColorHint != color) {
                    systemBarStateMonitor.mColorHint = color;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((ProtectionGroup) arrayList.get(size)).onColorHintChanged(color);
                    }
                }
            }
        };
        this.mDetector = r0;
        r0.setVisibility(8);
        r0.setWillNotDraw(true);
        StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1 = new StreamSharing$$ExternalSyntheticLambda1(this, 21);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(r0, streamSharing$$ExternalSyntheticLambda1);
        ViewCompat.setWindowInsetsAnimationCallback(r0, new zzabh() { // from class: androidx.core.view.insets.SystemBarStateMonitor.2
            public final HashMap mAnimationSidesMap = new HashMap();

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                ArrayList arrayList = SystemBarStateMonitor.this.mCallbacks;
                if ((windowInsetsAnimationCompat.mImpl.getTypeMask() & 519) != 0) {
                    this.mAnimationSidesMap.remove(windowInsetsAnimationCompat);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ProtectionGroup protectionGroup = (ProtectionGroup) arrayList.get(size);
                        int i2 = protectionGroup.mAnimationCount;
                        boolean z = i2 > 0;
                        int i3 = i2 - 1;
                        protectionGroup.mAnimationCount = i3;
                        if (z && i3 == 0) {
                            protectionGroup.updateInsets();
                        }
                    }
                }
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                ArrayList arrayList = SystemBarStateMonitor.this.mCallbacks;
                if ((windowInsetsAnimationCompat.mImpl.getTypeMask() & 519) != 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((ProtectionGroup) arrayList.get(size)).mAnimationCount++;
                    }
                }
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
                ArrayList arrayList = SystemBarStateMonitor.this.mCallbacks;
                RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
                int i2 = 0;
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) list.get(size);
                    Integer num = (Integer) this.mAnimationSidesMap.get(windowInsetsAnimationCompat);
                    if (num != null) {
                        int intValue = num.intValue();
                        float alpha = windowInsetsAnimationCompat.mImpl.getAlpha();
                        if ((intValue & 1) != 0) {
                            rectF.left = alpha;
                        }
                        if ((intValue & 2) != 0) {
                            rectF.top = alpha;
                        }
                        if ((intValue & 4) != 0) {
                            rectF.right = alpha;
                        }
                        if ((intValue & 8) != 0) {
                            rectF.bottom = alpha;
                        }
                        i2 |= intValue;
                    }
                }
                Insets min = Insets.min(windowInsetsCompat.mImpl.getInsets(519), windowInsetsCompat.mImpl.getInsets(64));
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ProtectionGroup protectionGroup = (ProtectionGroup) arrayList.get(size2);
                    Insets insets2 = protectionGroup.mInsetsIgnoringVisibility;
                    ArrayList arrayList2 = protectionGroup.mProtections;
                    for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                        ColorProtection colorProtection = (ColorProtection) arrayList2.get(size3);
                        int i3 = colorProtection.mSide;
                        if ((i3 & i2) != 0) {
                            Protection$Attributes protection$Attributes = colorProtection.mAttributes;
                            if (!protection$Attributes.mVisible) {
                                protection$Attributes.mVisible = true;
                                Recorder.AnonymousClass1 anonymousClass1 = protection$Attributes.mCallback;
                                if (anonymousClass1 != null) {
                                    ((View) anonymousClass1.this$0).setVisibility(0);
                                }
                            }
                            if (i3 == 1) {
                                int i4 = insets2.left;
                                if (i4 > 0) {
                                    colorProtection.setSystemInsetAmount(min.left / i4);
                                }
                                colorProtection.setSystemAlpha(rectF.left);
                            } else if (i3 == 2) {
                                int i5 = insets2.top;
                                if (i5 > 0) {
                                    colorProtection.setSystemInsetAmount(min.top / i5);
                                }
                                colorProtection.setSystemAlpha(rectF.top);
                            } else if (i3 == 4) {
                                int i6 = insets2.right;
                                if (i6 > 0) {
                                    colorProtection.setSystemInsetAmount(min.right / i6);
                                }
                                colorProtection.setSystemAlpha(rectF.right);
                            } else if (i3 == 8) {
                                int i7 = insets2.bottom;
                                if (i7 > 0) {
                                    colorProtection.setSystemInsetAmount(min.bottom / i7);
                                }
                                colorProtection.setSystemAlpha(rectF.bottom);
                            }
                        }
                    }
                }
                return windowInsetsCompat;
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final WorkLauncherImpl onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WorkLauncherImpl workLauncherImpl) {
                if ((windowInsetsAnimationCompat.mImpl.getTypeMask() & 519) != 0) {
                    Insets insets2 = (Insets) workLauncherImpl.workTaskExecutor;
                    Insets insets3 = (Insets) workLauncherImpl.processor;
                    int i2 = insets2.left != insets3.left ? 1 : 0;
                    if (insets2.top != insets3.top) {
                        i2 |= 2;
                    }
                    if (insets2.right != insets3.right) {
                        i2 |= 4;
                    }
                    if (insets2.bottom != insets3.bottom) {
                        i2 |= 8;
                    }
                    this.mAnimationSidesMap.put(windowInsetsAnimationCompat, Integer.valueOf(i2));
                }
                return workLauncherImpl;
            }
        });
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                view = null;
                break;
            }
            view = viewGroup.getChildAt(childCount);
            if (view.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (view == null) {
            viewGroup.addView((View) r0, 0);
        } else {
            view.addOnAttachStateChangeListener(new AnonymousClass3(i, viewGroup, (Object) r0));
        }
    }

    /* renamed from: androidx.core.view.insets.SystemBarStateMonitor$3, reason: invalid class name */
    public final class AnonymousClass3 implements View.OnAttachStateChangeListener {
        public final /* synthetic */ int $r8$classId;
        public final Object val$child;
        public Object val$group;

        public AnonymousClass3(View view, Function3 function3) {
            this.$r8$classId = 11;
            this.val$group = this;
            this.val$child = new Views$waitForMeasure$attachListener$1$listener$1(0, view, this, function3);
        }

        private final void onViewAttachedToWindow$com$google$maps$android$compose$clustering$ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$invokeSuspend$lambda$1$$inlined$doOnDetach$1(View view) {
        }

        private final void onViewAttachedToWindow$com$squareup$cash$directory_ui$views$ProfileDirectoryUiElementsKt$loadBitmap$lambda$0$$inlined$doOnDetach$1(View view) {
        }

        private final void onViewAttachedToWindow$com$squareup$cash$util$BackHandlerKt$setBackHandler$$inlined$doOnDetach$1(View view) {
        }

        private final void onViewDetachedFromWindow$com$squareup$cash$directory_ui$views$MooncakeHeaderView$setModel$$inlined$doOnAttach$1(View view) {
        }

        private final void onViewDetachedFromWindow$com$squareup$cash$ui$widget$NonFocusableTabLayoutKt$createTabIconView$lambda$0$$inlined$doOnAttach$1(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            int i = this.$r8$classId;
            int i2 = 4;
            Object obj = this.val$child;
            switch (i) {
                case 0:
                    ((ViewGroup) this.val$group).addView((AnonymousClass1) obj, 0);
                    view.removeOnAttachStateChangeListener(this);
                    break;
                case 1:
                    view.getClass();
                    LifecycleOwner lifecycleOwner = DBUtil.get(view);
                    lifecycleOwner.getClass();
                    Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                    lifecycle.addObserver((MapLifecycleEventObserver) obj);
                    this.val$group = lifecycle;
                    break;
                case 2:
                    break;
                case 3:
                    ((MooncakeHeaderView) this.val$group).removeOnAttachStateChangeListener(this);
                    VorbisUtil$Mode vorbisUtil$Mode = ((DirectoryListItem.Header) obj).$$delegate_0;
                    if (!vorbisUtil$Mode.blockFlag) {
                        vorbisUtil$Mode.blockFlag = true;
                        break;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    view.getClass();
                    ((ScrollView) this.val$group).addOnLayoutChangeListener((SplashScreen$Impl$setOnExitAnimationListener$2) obj);
                    break;
                case 6:
                    view.getClass();
                    ((View) this.val$group).addOnLayoutChangeListener((SearchView.AnonymousClass4) obj);
                    break;
                case 7:
                    view.getClass();
                    ((View) this.val$group).addOnLayoutChangeListener((Views$waitForMeasure$attachListener$1$listener$1) obj);
                    break;
                case 8:
                    view.getClass();
                    break;
                case 9:
                    ((View) this.val$group).removeOnAttachStateChangeListener(this);
                    ViewParent parent = view.getParent();
                    parent.getClass();
                    ViewGroup viewGroup = (ViewGroup) parent;
                    View view2 = (View) obj;
                    Context context = view2.getContext();
                    context.getClass();
                    int dip = Views.dip(context, 4);
                    Context context2 = view2.getContext();
                    context2.getClass();
                    viewGroup.setPadding(dip, viewGroup.getPaddingTop(), Views.dip(context2, 4), viewGroup.getPaddingBottom());
                    break;
                case 10:
                    break;
                case 11:
                    view.getClass();
                    view.addOnLayoutChangeListener((Views$waitForMeasure$attachListener$1$listener$1) obj);
                    break;
                default:
                    view.getClass();
                    Context context3 = ((Pi2GenericUiStepBottomSheetBinding) this.val$group).rootView.getContext();
                    context3.getClass();
                    ContextUtilsKt.hideKeyboard(context3);
                    view.postDelayed(new UiStepBottomSheet$$ExternalSyntheticLambda1((BottomSheetBehavior) obj, i2), 100L);
                    break;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            int i = this.$r8$classId;
            Object obj = this.val$child;
            switch (i) {
                case 0:
                    ((ViewGroup) this.val$group).addView((AnonymousClass1) obj, 0);
                    view.removeOnAttachStateChangeListener(this);
                    break;
                case 1:
                    MapLifecycleEventObserver mapLifecycleEventObserver = (MapLifecycleEventObserver) obj;
                    view.getClass();
                    Lifecycle lifecycle = (Lifecycle) this.val$group;
                    if (lifecycle != null) {
                        lifecycle.removeObserver(mapLifecycleEventObserver);
                    }
                    this.val$group = null;
                    Lifecycle.State state = mapLifecycleEventObserver.currentLifecycleState;
                    Lifecycle.State state2 = Lifecycle.State.CREATED;
                    if (state.compareTo(state2) > 0) {
                        mapLifecycleEventObserver.moveToLifecycleState(state2);
                        break;
                    }
                    break;
                case 2:
                    ((View) this.val$group).removeOnAttachStateChangeListener(this);
                    ((ProducerCoroutine) ((ProducerScope) obj)).close(null);
                    break;
                case 3:
                    break;
                case 4:
                    ((View) this.val$group).removeOnAttachStateChangeListener(this);
                    ((Disposable) obj).dispose();
                    break;
                case 5:
                    view.getClass();
                    ((ScrollView) this.val$group).removeOnLayoutChangeListener((SplashScreen$Impl$setOnExitAnimationListener$2) obj);
                    break;
                case 6:
                    view.getClass();
                    ((View) this.val$group).removeOnLayoutChangeListener((SearchView.AnonymousClass4) obj);
                    break;
                case 7:
                    view.getClass();
                    ((View) this.val$group).removeOnLayoutChangeListener((Views$waitForMeasure$attachListener$1$listener$1) obj);
                    break;
                case 8:
                    view.getClass();
                    ((TaxWebAppView) this.val$group).removeOnAttachStateChangeListener(this);
                    JobKt.cancel((ContextScope) obj, (CancellationException) null);
                    break;
                case 9:
                    break;
                case 10:
                    ((View) this.val$group).removeOnAttachStateChangeListener(this);
                    ((RedwoodLayoutKt$toAndroid$1) obj).remove();
                    break;
                case 11:
                    view.getClass();
                    view.removeOnLayoutChangeListener((Views$waitForMeasure$attachListener$1$listener$1) obj);
                    break;
                default:
                    view.getClass();
                    break;
            }
        }

        public /* synthetic */ AnonymousClass3(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.val$group = obj;
            this.val$child = obj2;
        }

        public AnonymousClass3(MooncakeHeaderView mooncakeHeaderView, DirectoryListItem.Header header, Ui.EventReceiver eventReceiver) {
            this.$r8$classId = 3;
            this.val$group = mooncakeHeaderView;
            this.val$child = header;
        }

        public AnonymousClass3(MapLifecycleEventObserver mapLifecycleEventObserver) {
            this.$r8$classId = 1;
            this.val$child = mapLifecycleEventObserver;
        }
    }
}
