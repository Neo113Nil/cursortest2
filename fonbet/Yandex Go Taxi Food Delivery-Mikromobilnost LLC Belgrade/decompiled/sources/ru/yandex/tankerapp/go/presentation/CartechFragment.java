package ru.yandex.tankerapp.go.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import defpackage.c19;
import defpackage.d19;
import defpackage.e9e;
import defpackage.i3y;
import defpackage.icx;
import defpackage.ju8;
import defpackage.ogb1;
import defpackage.qx60;
import defpackage.scc;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.tankerapp.go.models.HomeInitialModel;
import ru.yandex.tankerapp.go.presentation.CartechFragment;

@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006*\u0001%\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\fR\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/yandex/tankerapp/go/presentation/CartechFragment;", "Lio/flutter/embedding/android/FlutterFragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "onResume", "", "popSystemNavigator", "()Z", "onDetach", "", "", "getDartEntrypointArgs", "()Ljava/util/List;", "getDartEntrypointFunctionName", "()Ljava/lang/String;", "Lio/flutter/embedding/engine/FlutterEngine;", "flutterEngine", "configureFlutterEngine", "(Lio/flutter/embedding/engine/FlutterEngine;)V", "shouldAttachEngineToActivity", "Lru/yandex/tankerapp/go/models/HomeInitialModel;", "initialModel$delegate", "Li3y;", "getInitialModel", "()Lru/yandex/tankerapp/go/models/HomeInitialModel;", "initialModel", "Le9e;", "", "onTrimMemoryConsumer", "Le9e;", "Landroid/content/Intent;", "onNewIntentConsumer", "d19", "onBackPressedCallback", "Ld19;", "Companion", "c19", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CartechFragment extends FlutterFragment {
    public static final c19 Companion = new c19();
    private static final String KEY_INITIAL_MODEL = "KEY_INITIAL_MODEL";

    /* renamed from: initialModel$delegate, reason: from kotlin metadata */
    private final i3y initialModel = a.a(new ju8(3, this));
    private final d19 onBackPressedCallback = new d19(this);
    private final e9e onNewIntentConsumer;
    private final e9e onTrimMemoryConsumer;

    public CartechFragment() {
        final int i = 0;
        this.onTrimMemoryConsumer = new e9e(this) { // from class: b19
            public final /* synthetic */ CartechFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.e9e
            public final void accept(Object obj) {
                int i2 = i;
                CartechFragment cartechFragment = this.b;
                switch (i2) {
                    case 0:
                        cartechFragment.onTrimMemory(((Integer) obj).intValue());
                        break;
                    default:
                        cartechFragment.onNewIntent((Intent) obj);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.onNewIntentConsumer = new e9e(this) { // from class: b19
            public final /* synthetic */ CartechFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.e9e
            public final void accept(Object obj) {
                int i22 = i2;
                CartechFragment cartechFragment = this.b;
                switch (i22) {
                    case 0:
                        cartechFragment.onTrimMemory(((Integer) obj).intValue());
                        break;
                    default:
                        cartechFragment.onNewIntent((Intent) obj);
                        break;
                }
            }
        };
    }

    private final HomeInitialModel getInitialModel() {
        return (HomeInitialModel) this.initialModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeInitialModel initialModel_delegate$lambda$0(CartechFragment cartechFragment) {
        Object obj;
        Bundle requireArguments = cartechFragment.requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            obj = requireArguments.getSerializable("KEY_INITIAL_MODEL", HomeInitialModel.class);
        } else {
            Object serializable = requireArguments.getSerializable(KEY_INITIAL_MODEL);
            if (!(serializable instanceof HomeInitialModel)) {
                serializable = null;
            }
            obj = (HomeInitialModel) serializable;
        }
        return (HomeInitialModel) obj;
    }

    @Override // io.flutter.embedding.android.FlutterFragment, defpackage.lrr, defpackage.vrr
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);
        ogb1.c(flutterEngine);
    }

    @Override // io.flutter.embedding.android.FlutterFragment, defpackage.lrr
    public List<String> getDartEntrypointArgs() {
        i3y i3yVar = icx.a;
        return scc.i(icx.a().h(getInitialModel()));
    }

    @Override // io.flutter.embedding.android.FlutterFragment, defpackage.lrr
    public String getDartEntrypointFunctionName() {
        return "mainTanker";
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ComponentActivity componentActivity = context instanceof ComponentActivity ? (ComponentActivity) context : null;
        if (componentActivity != null) {
            componentActivity.addOnTrimMemoryListener(this.onTrimMemoryConsumer);
            componentActivity.addOnNewIntentListener(this.onNewIntentConsumer);
            componentActivity.getOnBackPressedDispatcher().b(this.onBackPressedCallback);
        }
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        this.onBackPressedCallback.g();
        Context context = getContext();
        ComponentActivity componentActivity = context instanceof ComponentActivity ? (ComponentActivity) context : null;
        if (componentActivity != null) {
            componentActivity.removeOnTrimMemoryListener(this.onTrimMemoryConsumer);
            componentActivity.removeOnNewIntentListener(this.onNewIntentConsumer);
        }
        super.onDetach();
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        onPostResume();
    }

    @Override // io.flutter.embedding.android.FlutterFragment, defpackage.xvc0
    public boolean popSystemNavigator() {
        qx60 onBackPressedDispatcher;
        this.onBackPressedCallback.h(false);
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.c();
        }
        this.onBackPressedCallback.h(true);
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterFragment, defpackage.lrr
    public boolean shouldAttachEngineToActivity() {
        return true;
    }
}
