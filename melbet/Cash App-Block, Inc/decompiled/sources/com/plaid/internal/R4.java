package com.plaid.internal;

import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.activity.result.ActivityResultLauncher;
import com.plaid.internal.Y6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class R4 extends WebChromeClient {
    public final ActivityResultLauncher<String> a;
    public final ActivityResultLauncher<Unit> b;
    public final U7 c;
    public final P7 d;

    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ PermissionRequest a;
        public final /* synthetic */ String[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PermissionRequest permissionRequest, String[] strArr) {
            super(0);
            this.a = permissionRequest;
            this.b = strArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.a.grant(this.b);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ PermissionRequest a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PermissionRequest permissionRequest) {
            super(0);
            this.a = permissionRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.a.deny();
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ActivityResultLauncher<Unit> activityResultLauncher = R4.this.b;
            Unit unit = Unit.INSTANCE;
            activityResultLauncher.launch(unit);
            return unit;
        }
    }

    public R4(ActivityResultLauncher activityResultLauncher, ActivityResultLauncher activityResultLauncher2, U7 u7, P7 p7) {
        activityResultLauncher.getClass();
        activityResultLauncher2.getClass();
        u7.getClass();
        p7.getClass();
        this.a = activityResultLauncher;
        this.b = activityResultLauncher2;
        this.c = u7;
        this.d = p7;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (permissionRequest == null) {
            return;
        }
        String[] resources = permissionRequest.getResources();
        resources.getClass();
        if (ArraysKt___ArraysKt.contains(resources, "android.webkit.resource.VIDEO_CAPTURE")) {
            String[] strArr = (String[]) CollectionsKt__CollectionsJVMKt.listOf("android.webkit.resource.VIDEO_CAPTURE").toArray(new String[0]);
            if (this.d.a()) {
                permissionRequest.grant(strArr);
            } else {
                this.d.a(new a(permissionRequest, strArr), new b(permissionRequest));
            }
        }
        String[] resources2 = permissionRequest.getResources();
        resources2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : resources2) {
            if (!Intrinsics.areEqual(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Y6.a.a("WebView requesting unsupported permission - " + ((String) it.next()));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        webView.getClass();
        if (i == 100) {
            i = 0;
        }
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes;
        if (valueCallback == null) {
            return false;
        }
        this.c.n = valueCallback;
        if (fileChooserParams == null || !fileChooserParams.isCaptureEnabled() || (acceptTypes = fileChooserParams.getAcceptTypes()) == null || !ArraysKt___ArraysKt.contains(acceptTypes, "image/jpeg")) {
            this.a.launch("*/*");
            return true;
        }
        if (webView == null) {
            return false;
        }
        if (this.d.a()) {
            this.b.launch(Unit.INSTANCE);
            return true;
        }
        P7 p7 = this.d;
        c cVar = new c();
        M4 m4 = M4.a;
        p7.getClass();
        m4.getClass();
        p7.f = cVar;
        p7.g = m4;
        p7.h.launch("android.permission.CAMERA");
        return true;
    }
}
