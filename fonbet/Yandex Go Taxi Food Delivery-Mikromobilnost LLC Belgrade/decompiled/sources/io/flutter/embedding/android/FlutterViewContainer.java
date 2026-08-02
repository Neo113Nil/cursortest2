package io.flutter.embedding.android;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks;
import defpackage.etr;
import defpackage.gtr;
import defpackage.ktr;
import defpackage.ny61;
import defpackage.pey;
import defpackage.qv10;
import io.flutter.embedding.android.FlutterViewContainer;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001UBQ\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010\u001dJ\u0017\u0010)\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b)\u0010\u001dJ\u000f\u0010*\u001a\u00020\u001eH\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b,\u0010\u001dJ\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00162\u0006\u00105\u001a\u000202H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00162\u0006\u00105\u001a\u000202H\u0016¢\u0006\u0004\b8\u00107J\u0017\u0010;\u001a\u00020\u00162\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00162\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0016H\u0016¢\u0006\u0004\bA\u0010\u0018J\u000f\u0010B\u001a\u00020\u0016H\u0016¢\u0006\u0004\bB\u0010\u0018J\u000f\u0010C\u001a\u00020\u0012H\u0016¢\u0006\u0004\bC\u0010DR\u0017\u0010%\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b%\u0010F\u001a\u0004\b-\u0010GR(\u0010J\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010H8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bO\u0010P\u0012\u0004\bQ\u0010\u0018R\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006V"}, d2 = {"Lio/flutter/embedding/android/FlutterViewContainer;", "Landroid/widget/FrameLayout;", "Lgtr;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/yandex/mobile/drive/tools/SimpleActivityLifecycleCallbacks;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "Lio/flutter/embedding/android/RenderMode;", "renderMode", "Lio/flutter/embedding/android/TransparencyMode;", "transparencyMode", "", "", "entrypointArgs", "", "legacyChrome", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILio/flutter/embedding/android/RenderMode;Lio/flutter/embedding/android/TransparencyMode;Ljava/util/List;Z)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lpey;", "owner", "onCreate", "(Lpey;)V", "Landroid/os/Parcelable;", ClidProvider.STATE, "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onStart", "onResume", "Landroid/app/Activity;", "activity", "onActivityPostResumed", "(Landroid/app/Activity;)V", "onPause", "onStop", "onSaveInstanceState", "()Landroid/os/Parcelable;", "onDestroy", "getActivity", "()Landroid/app/Activity;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "Lio/flutter/embedding/engine/FlutterEngine;", "provideFlutterEngine", "(Landroid/content/Context;)Lio/flutter/embedding/engine/FlutterEngine;", "flutterEngine", "configureFlutterEngine", "(Lio/flutter/embedding/engine/FlutterEngine;)V", "cleanUpFlutterEngine", "Lio/flutter/embedding/android/FlutterSurfaceView;", "flutterSurfaceView", "onFlutterSurfaceViewCreated", "(Lio/flutter/embedding/android/FlutterSurfaceView;)V", "Lio/flutter/embedding/android/FlutterTextureView;", "flutterTextureView", "onFlutterTextureViewCreated", "(Lio/flutter/embedding/android/FlutterTextureView;)V", "onFlutterUiDisplayed", "onFlutterUiNoLongerDisplayed", "popSystemNavigator", "()Z", "Landroidx/activity/ComponentActivity;", "Landroidx/activity/ComponentActivity;", "()Landroidx/activity/ComponentActivity;", "Lio/flutter/embedding/android/FlutterEmbedViewDelegate;", "value", "delegate", "Lio/flutter/embedding/android/FlutterEmbedViewDelegate;", "getDelegate$drive_sdk_go_release", "()Lio/flutter/embedding/android/FlutterEmbedViewDelegate;", "Lktr;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "Lktr;", "getHost$annotations", "Landroidx/lifecycle/Lifecycle$Event;", "handledLifecycle", "Landroidx/lifecycle/Lifecycle$Event;", "SavedState", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class FlutterViewContainer extends FrameLayout implements gtr, DefaultLifecycleObserver, SimpleActivityLifecycleCallbacks {
    private final ComponentActivity activity;
    private FlutterEmbedViewDelegate delegate;
    private Lifecycle.Event handledLifecycle;
    private final ktr host;

    public FlutterViewContainer(Context context, AttributeSet attributeSet, int i, RenderMode renderMode, TransparencyMode transparencyMode, List<String> list, boolean z) {
        super(context, attributeSet, i);
        Context context2 = context;
        while (!(context2 instanceof ComponentActivity)) {
            FlutterViewContainer flutterViewContainer = this;
            Context context3 = context;
            RenderMode renderMode2 = renderMode;
            TransparencyMode transparencyMode2 = transparencyMode;
            List<String> list2 = list;
            if (context2 instanceof Activity) {
                ny61.g(qv10.l(ComponentActivity.class, "context is not "));
                throw null;
            }
            context2 = context2 instanceof ContextWrapper ? ((ContextWrapper) context2).getBaseContext() : context2;
            if ((context2 instanceof Application) || (context2 instanceof Service)) {
                ny61.g("context is not Activity");
                throw null;
            }
            context = context3;
            this = flutterViewContainer;
            renderMode = renderMode2;
            transparencyMode = transparencyMode2;
            list = list2;
        }
        this.activity = (ComponentActivity) context2;
        FlutterViewContainer flutterViewContainer2 = this;
        flutterViewContainer2.host = new ktr(context, flutterViewContainer2, renderMode, transparencyMode, etr.a, list, z && Build.VERSION.SDK_INT <= 29);
    }

    private static /* synthetic */ void getHost$annotations() {
    }

    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
    }

    public void configureFlutterEngine(FlutterEngine flutterEngine) {
    }

    @Override // defpackage.gtr
    public final ComponentActivity getActivity() {
        return this.activity;
    }

    /* renamed from: getDelegate$drive_sdk_go_release, reason: from getter */
    public final FlutterEmbedViewDelegate getDelegate() {
        return this.delegate;
    }

    @Override // defpackage.gtr
    public Lifecycle getLifecycle() {
        return this.activity.getLifecycle();
    }

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
    }

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
    }

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        FlutterEmbedViewDelegate flutterEmbedViewDelegate = this.delegate;
        if (flutterEmbedViewDelegate != null) {
            if (!flutterEmbedViewDelegate.isAttached()) {
                flutterEmbedViewDelegate = null;
            }
            if (flutterEmbedViewDelegate != null) {
                flutterEmbedViewDelegate.onPostResume();
            }
        }
    }

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
    }

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        super.onActivitySaveInstanceState(activity, bundle);
    }

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
    }

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.activity.getLifecycle().a(this);
        this.activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(pey owner) {
        View onCreateView;
        this.handledLifecycle = Lifecycle.Event.ON_CREATE;
        FlutterEmbedViewDelegate flutterEmbedViewDelegate = new FlutterEmbedViewDelegate(this.host);
        this.delegate = flutterEmbedViewDelegate;
        flutterEmbedViewDelegate.onAttach(getContext());
        FlutterEmbedViewDelegate flutterEmbedViewDelegate2 = this.delegate;
        if (flutterEmbedViewDelegate2 == null || (onCreateView = flutterEmbedViewDelegate2.onCreateView(null, null, null, etr.a, false)) == null) {
            return;
        }
        addView(onCreateView);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(pey owner) {
        this.handledLifecycle = Lifecycle.Event.ON_DESTROY;
        FlutterEmbedViewDelegate flutterEmbedViewDelegate = this.delegate;
        if (flutterEmbedViewDelegate != null) {
            if (!flutterEmbedViewDelegate.isAttached()) {
                flutterEmbedViewDelegate = null;
            }
            if (flutterEmbedViewDelegate != null) {
                flutterEmbedViewDelegate.onDestroyView();
                flutterEmbedViewDelegate.onDetach();
            }
        }
        FlutterEmbedViewDelegate flutterEmbedViewDelegate2 = this.delegate;
        if (flutterEmbedViewDelegate2 != null) {
            flutterEmbedViewDelegate2.release();
        }
        this.delegate = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
        this.activity.getLifecycle().d(this);
        this.activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        Lifecycle.Event event = this.handledLifecycle;
        if (event == Lifecycle.Event.ON_RESUME) {
            onPause(this.activity);
            onStop(this.activity);
        } else if (event == Lifecycle.Event.ON_START) {
            onStop(this.activity);
        }
        onDestroy(this.activity);
    }

    @Override // defpackage.gtr
    public void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView) {
    }

    @Override // defpackage.gtr
    public void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView) {
    }

    @Override // defpackage.gtr
    public void onFlutterUiDisplayed() {
    }

    @Override // defpackage.gtr
    public void onFlutterUiNoLongerDisplayed() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(pey owner) {
        this.handledLifecycle = Lifecycle.Event.ON_PAUSE;
        FlutterEmbedViewDelegate flutterEmbedViewDelegate = this.delegate;
        if (flutterEmbedViewDelegate != null) {
            if (!flutterEmbedViewDelegate.isAttached()) {
                flutterEmbedViewDelegate = null;
            }
            if (flutterEmbedViewDelegate != null) {
                flutterEmbedViewDelegate.onPause();
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        super.onRestoreInstanceState(state);
        FlutterEmbedViewDelegate flutterEmbedViewDelegate = this.delegate;
        if (flutterEmbedViewDelegate != null) {
            flutterEmbedViewDelegate.onRestoreInstanceState(((SavedState) state).getBundle());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(pey owner) {
        this.handledLifecycle = Lifecycle.Event.ON_RESUME;
        FlutterEmbedViewDelegate flutterEmbedViewDelegate = this.delegate;
        if (flutterEmbedViewDelegate != null) {
            if (!flutterEmbedViewDelegate.isAttached()) {
                flutterEmbedViewDelegate = null;
            }
            if (flutterEmbedViewDelegate != null) {
                flutterEmbedViewDelegate.onResume();
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.setBundle(bundle);
        FlutterEmbedViewDelegate flutterEmbedViewDelegate = this.delegate;
        if (flutterEmbedViewDelegate != null) {
            if (!flutterEmbedViewDelegate.isAttached()) {
                flutterEmbedViewDelegate = null;
            }
            if (flutterEmbedViewDelegate != null) {
                flutterEmbedViewDelegate.onSaveInstanceState(bundle);
            }
        }
        return savedState;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(pey owner) {
        this.handledLifecycle = Lifecycle.Event.ON_START;
        FlutterEmbedViewDelegate flutterEmbedViewDelegate = this.delegate;
        if (flutterEmbedViewDelegate != null) {
            if (!flutterEmbedViewDelegate.isAttached()) {
                flutterEmbedViewDelegate = null;
            }
            if (flutterEmbedViewDelegate != null) {
                flutterEmbedViewDelegate.onStart();
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(pey owner) {
        this.handledLifecycle = Lifecycle.Event.ON_STOP;
        FlutterEmbedViewDelegate flutterEmbedViewDelegate = this.delegate;
        if (flutterEmbedViewDelegate != null) {
            if (!flutterEmbedViewDelegate.isAttached()) {
                flutterEmbedViewDelegate = null;
            }
            if (flutterEmbedViewDelegate != null) {
                flutterEmbedViewDelegate.onStop();
            }
        }
    }

    public boolean popSystemNavigator() {
        return false;
    }

    @Override // defpackage.gtr
    public FlutterEngine provideFlutterEngine(Context context) {
        return null;
    }

    public /* bridge */ /* synthetic */ void setFrameworkHandlesBack(boolean z) {
    }

    @Override // defpackage.gtr
    public Activity getActivity() {
        return this.activity;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0013\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lio/flutter/embedding/android/FlutterViewContainer$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "<init>", "(Landroid/os/Parcelable;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "out", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/os/Bundle;", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "Companion", "io/flutter/embedding/android/e", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {
        private Bundle bundle;
        public static final e Companion = new e();
        public static Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: io.flutter.embedding.android.FlutterViewContainer$SavedState$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public FlutterViewContainer.SavedState createFromParcel(Parcel source) {
                return new FlutterViewContainer.SavedState(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public FlutterViewContainer.SavedState[] newArray(int size) {
                return new FlutterViewContainer.SavedState[size];
            }
        };

        public SavedState(Parcel parcel) {
            super(parcel);
            this.bundle = parcel.readBundle(SavedState.class.getClassLoader());
        }

        public final Bundle getBundle() {
            return this.bundle;
        }

        public final void setBundle(Bundle bundle) {
            this.bundle = bundle;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeBundle(this.bundle);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public FlutterViewContainer(Context context, AttributeSet attributeSet, RenderMode renderMode, TransparencyMode transparencyMode, List<String> list) {
        this(context, attributeSet, 0, renderMode, transparencyMode, list, false, 68, null);
    }

    public FlutterViewContainer(Context context, RenderMode renderMode, TransparencyMode transparencyMode, List<String> list) {
        this(context, null, 0, renderMode, transparencyMode, list, false, 70, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FlutterViewContainer(android.content.Context r9, android.util.AttributeSet r10, int r11, io.flutter.embedding.android.RenderMode r12, io.flutter.embedding.android.TransparencyMode r13, java.util.List r14, boolean r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 2
            if (r0 == 0) goto L5
            r10 = 0
        L5:
            r2 = r10
            r10 = r16 & 4
            r0 = 0
            if (r10 == 0) goto Ld
            r3 = r0
            goto Le
        Ld:
            r3 = r11
        Le:
            r10 = r16 & 64
            if (r10 == 0) goto L19
            r7 = r0
            r1 = r9
            r4 = r12
            r5 = r13
            r6 = r14
            r0 = r8
            goto L1f
        L19:
            r7 = r15
            r0 = r8
            r1 = r9
            r4 = r12
            r5 = r13
            r6 = r14
        L1f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.FlutterViewContainer.<init>(android.content.Context, android.util.AttributeSet, int, io.flutter.embedding.android.RenderMode, io.flutter.embedding.android.TransparencyMode, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public FlutterViewContainer(Context context, AttributeSet attributeSet, int i, RenderMode renderMode, TransparencyMode transparencyMode, List<String> list) {
        this(context, attributeSet, i, renderMode, transparencyMode, list, false, 64, null);
    }
}
