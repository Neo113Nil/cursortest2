package com.nimbusds.jose.jwk;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.knotapi.knot.ui.activities.KnotActivity;
import com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment;
import com.knotapi.knot.webview.PopupChromeClient;
import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.infrastructure.ro;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.shaded.gson.JsonIOException;
import com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final /* synthetic */ class JWK$$ExternalSyntheticBUOutline0 implements GoogleMap.OnInfoWindowLongClickListener, OnApplyWindowInsetsListener, ObjectConstructor {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void m$1(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void m$2(Object obj, String str) {
        throw new JOSEException(str + obj);
    }

    public static /* synthetic */ void m$3(Object obj, String str) {
        throw new ParseException(str + obj, 0);
    }

    public static /* synthetic */ void m$4(Object obj, String str) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.$r8$classId) {
            case 24:
                return new ArrayList();
            case 25:
                return new LinkedHashSet();
            case 26:
                return new TreeSet();
            case 27:
                return new ArrayDeque();
            case 28:
                return new LinkedTreeMap(true);
            default:
                return new LinkedHashMap();
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat lambda$onCreate$0;
        WindowInsetsCompat lambda$onViewCreated$2;
        WindowInsetsCompat lambda$onCreateWindow$2;
        switch (this.$r8$classId) {
            case 11:
                lambda$onCreate$0 = KnotActivity.lambda$onCreate$0(view, windowInsetsCompat);
                return lambda$onCreate$0;
            case 12:
                lambda$onViewCreated$2 = MerchantWebViewListenerFragment.lambda$onViewCreated$2(view, windowInsetsCompat);
                return lambda$onViewCreated$2;
            default:
                lambda$onCreateWindow$2 = PopupChromeClient.lambda$onCreateWindow$2(view, windowInsetsCompat);
                return lambda$onCreateWindow$2;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(Marker marker) {
    }

    public /* synthetic */ JWK$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m2174m$1() {
        throw new RuntimeException();
    }

    public static /* synthetic */ void m$1(String str) {
        throw new ParseException(str, 0);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m2173m() {
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, long j) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + j);
    }

    public static /* synthetic */ void m(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void m(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new ArrayIndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new ArithmeticException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Throwable th) {
        throw new ro(str + obj + obj2 + th, th);
    }

    public static /* synthetic */ void m(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new InvalidInputException(sb.toString());
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new ro("Invalid key spec: " + th, th);
    }
}
