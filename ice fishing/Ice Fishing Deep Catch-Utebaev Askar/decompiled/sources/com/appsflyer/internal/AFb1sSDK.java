package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFb1sSDK {
    private final AFa1oSDK getMonetizationNetwork;

    public AFb1sSDK(AFa1oSDK aFa1oSDK) {
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        this.getMonetizationNetwork = aFa1oSDK;
    }

    public final void afInfoLog() {
        try {
            Map map = AFa1vSDK.registerClient;
            Object declaredConstructor = map.get(-305051340);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1vSDK.getRevenue((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, 322 - (KeyEvent.getMaxKeyCode() >> 16), (char) (52978 - KeyEvent.keyCodeFromString("")))).getDeclaredConstructor(null);
                map.put(-305051340, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            Object[] objArr = {this.getMonetizationNetwork};
            Object method = map.get(-1120235931);
            if (method == null) {
                method = ((Class) AFa1vSDK.getRevenue(37 - View.resolveSize(0, 0), TextUtils.getTrimmedLength("") + 322, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 52978))).getMethod("getMonetizationNetwork", AFa1oSDK.class);
                map.put(-1120235931, method);
            }
            ((Method) method).invoke(objNewInstance, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
