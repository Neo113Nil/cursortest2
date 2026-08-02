package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.util.Log;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import com.google.mlkit.vision.text.zzc;
import com.squareup.protos.cash.genericelements.ui.VerticalAlignment;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerKey;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzat {
    public static final SystemUiController getSystemUiController(ViewEnvironment viewEnvironment) {
        viewEnvironment.getClass();
        Object obj = viewEnvironment.map.get(SystemUiControllerKey.INSTANCE);
        if (obj instanceof SystemUiController) {
            return (SystemUiController) obj;
        }
        return null;
    }

    public static final BiasAlignment.Vertical toAlignment(VerticalAlignment verticalAlignment) {
        int ordinal = verticalAlignment.ordinal();
        if (ordinal == 0) {
            return Alignment.Companion.Top;
        }
        if (ordinal == 1) {
            return Alignment.Companion.Bottom;
        }
        if (ordinal == 2) {
            return Alignment.Companion.CenterVertically;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final void updateSystemUiColor(ViewEnvironment viewEnvironment, Context context, int i) {
        viewEnvironment.getClass();
        context.getClass();
        Object obj = viewEnvironment.map.get(SystemUiControllerKey.INSTANCE);
        SystemUiController systemUiController = obj instanceof SystemUiController ? (SystemUiController) obj : null;
        if (systemUiController != null) {
            systemUiController.updateSystemUiColor(context, i);
        }
    }

    public static boolean zze(ClassLoader classLoader, File file, File file2, boolean z, com.google.mlkit.vision.text.zzb zzbVar, String str, zzc zzcVar) {
        ArrayList arrayList = new ArrayList();
        Field zzh = zzbk.zzh(classLoader, "pathList");
        try {
            Object cast = Object.class.cast(zzh.get(classLoader));
            zzbi zza = zzbk.zza("dexElements", cast, Object.class);
            List asList = Arrays.asList((Object[]) zza.zzc());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : asList) {
                Field zzh2 = zzbk.zzh(obj, str);
                try {
                    arrayList2.add((File) File.class.cast(zzh2.get(obj)));
                } catch (Exception e) {
                    String name = zzh2.getName();
                    String name2 = obj.getClass().getName();
                    String name3 = File.class.getName();
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to get value of field ", name, " of type ", name2, " on object of type ");
                    m.append(name3);
                    throw new zzbl(m.toString(), e);
                }
            }
            if (arrayList2.contains(file2)) {
                return true;
            }
            try {
                zza.zza(Arrays.asList((Object[]) Object[].class.cast(zzbk.zzi(cast.getClass(), "makePathElements", List.class, File.class, List.class).invoke(cast, new ArrayList(Collections.singleton(file2)), file, arrayList))));
                if (arrayList.isEmpty()) {
                    return true;
                }
                zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    IOException iOException = (IOException) arrayList.get(i);
                    Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, iOException);
                    } catch (Exception unused) {
                    }
                }
                zzbk.zza("dexElementsSuppressedExceptions", cast, IOException.class).zza(arrayList);
                throw zzbhVar;
            } catch (Exception e2) {
                throw new zzbl("Failed to invoke method makePathElements on an object of type " + cast.getClass(), e2);
            }
        } catch (Exception e3) {
            String name4 = zzh.getName();
            String name5 = classLoader.getClass().getName();
            String name6 = Object.class.getName();
            StringBuilder m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to get value of field ", name4, " of type ", name5, " on object of type ");
            m2.append(name6);
            throw new zzbl(m2.toString(), e3);
        }
    }
}
