package ru.yandex.tankerapp.go.presentation;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import defpackage.g19;
import defpackage.i3y;
import defpackage.icx;
import defpackage.ju8;
import defpackage.n19;
import defpackage.ogb1;
import defpackage.scc;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.tankerapp.go.models.HomeInitialModel;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lru/yandex/tankerapp/go/presentation/CartechHomeActivity;", "Lio/flutter/embedding/android/FlutterActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "", "", "getDartEntrypointArgs", "()Ljava/util/List;", "getDartEntrypointFunctionName", "()Ljava/lang/String;", "Lio/flutter/embedding/engine/FlutterEngine;", "flutterEngine", "configureFlutterEngine", "(Lio/flutter/embedding/engine/FlutterEngine;)V", "Lru/yandex/tankerapp/go/models/HomeInitialModel;", "initialData$delegate", "Li3y;", "getInitialData", "()Lru/yandex/tankerapp/go/models/HomeInitialModel;", "initialData", "Companion", "g19", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CartechHomeActivity extends FlutterActivity {
    public static final g19 Companion = new g19();
    private static final String KEY_INITIAL_DATA = "key_initial_data";

    /* renamed from: initialData$delegate, reason: from kotlin metadata */
    private final i3y initialData = a.a(new ju8(4, this));

    private final HomeInitialModel getInitialData() {
        return (HomeInitialModel) this.initialData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeInitialModel initialData_delegate$lambda$0(CartechHomeActivity cartechHomeActivity) {
        Object obj;
        Intent intent = cartechHomeActivity.getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            obj = intent.getSerializableExtra("key_initial_data", HomeInitialModel.class);
        } else {
            Object serializableExtra = intent.getSerializableExtra(KEY_INITIAL_DATA);
            if (!(serializableExtra instanceof HomeInitialModel)) {
                serializableExtra = null;
            }
            obj = (HomeInitialModel) serializableExtra;
        }
        return (HomeInitialModel) obj;
    }

    @Override // io.flutter.embedding.android.FlutterActivity, defpackage.lrr, defpackage.vrr
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);
        if (n19.b != null) {
            ogb1.c(flutterEngine);
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivity, defpackage.lrr
    public List<String> getDartEntrypointArgs() {
        i3y i3yVar = icx.a;
        return scc.i(icx.a().h(getInitialData()));
    }

    @Override // io.flutter.embedding.android.FlutterActivity, defpackage.lrr
    public String getDartEntrypointFunctionName() {
        return "mainTanker";
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        Companion.getClass();
        window.setStatusBarColor(0);
        window.clearFlags(SelfTester_JCP.DECRYPT_CBC);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        setRequestedOrientation(1);
        if (n19.b != null) {
            return;
        }
        finish();
    }
}
