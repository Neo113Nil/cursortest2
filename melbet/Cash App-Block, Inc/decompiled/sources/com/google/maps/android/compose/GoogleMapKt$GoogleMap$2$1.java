package com.google.maps.android.compose;

import android.content.Context;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class GoogleMapKt$GoogleMap$2$1 extends FunctionReferenceImpl implements Function2 {
    public static final GoogleMapKt$GoogleMap$2$1 INSTANCE = new GoogleMapKt$GoogleMap$2$1(2, MapView.class, "<init>", "<init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        context.getClass();
        return new MapView(context, (GoogleMapOptions) obj2);
    }
}
