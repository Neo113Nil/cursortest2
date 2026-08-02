package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import defpackage.abe;
import defpackage.gx10;
import defpackage.hx10;
import defpackage.l40;
import defpackage.lx10;
import defpackage.ny61;
import defpackage.omy0;
import defpackage.pey;
import defpackage.r30;
import defpackage.ssr;
import defpackage.tsr;
import defpackage.tt5;
import defpackage.wrr;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.plugins.imagepicker.Messages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes4.dex */
public class ImagePickerPlugin implements tsr, r30, h {
    public ssr a;
    public e b;

    public class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
        private final Activity thisActivity;

        public LifeCycleObserver(Activity activity) {
            this.thisActivity = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.thisActivity != activity || activity.getApplicationContext() == null) {
                return;
            }
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (this.thisActivity == activity) {
                c cVar = ImagePickerPlugin.this.b.c;
                synchronized (cVar.E) {
                    try {
                        b bVar = cVar.D;
                        if (bVar == null) {
                            return;
                        }
                        lx10 lx10Var = bVar.a;
                        a aVar = cVar.w;
                        ImagePickerCache$CacheType imagePickerCache$CacheType = lx10Var != null ? ImagePickerCache$CacheType.IMAGE : ImagePickerCache$CacheType.VIDEO;
                        aVar.getClass();
                        int ordinal = imagePickerCache$CacheType.ordinal();
                        if (ordinal == 0) {
                            aVar.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", "image").apply();
                        } else if (ordinal == 1) {
                            aVar.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", MediaStreamTrack.VIDEO_TRACK_KIND).apply();
                        }
                        if (lx10Var != null) {
                            SharedPreferences.Editor edit = cVar.w.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
                            Double d = lx10Var.a;
                            if (d != null) {
                                edit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(d.doubleValue()));
                            }
                            Double d2 = lx10Var.b;
                            if (d2 != null) {
                                edit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(d2.doubleValue()));
                            }
                            edit.putInt("flutter_image_picker_image_quality", lx10Var.c.intValue());
                            edit.apply();
                        }
                        Uri uri = cVar.C;
                        if (uri != null) {
                            cVar.w.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(pey peyVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(pey peyVar) {
            onActivityDestroyed(this.thisActivity);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(pey peyVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(pey peyVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(pey peyVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(pey peyVar) {
            onActivityStopped(this.thisActivity);
        }
    }

    public final g b() {
        boolean z;
        g gVar;
        Context context;
        Set<String> stringSet;
        e eVar = this.b;
        c cVar = (eVar == null || eVar.b == null) ? null : eVar.c;
        if (cVar == null) {
            throw new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity.");
        }
        a aVar = cVar.w;
        aVar.getClass();
        Context context2 = aVar.a;
        HashMap hashMap = new HashMap();
        SharedPreferences sharedPreferences = context2.getSharedPreferences("flutter_image_picker_shared_preference", 0);
        boolean z2 = true;
        if (!sharedPreferences.contains("flutter_image_picker_image_path") || (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", null)) == null) {
            z = false;
        } else {
            hashMap.put("pathList", new ArrayList(stringSet));
            z = true;
        }
        if (sharedPreferences.contains("flutter_image_picker_error_code")) {
            gx10 gx10Var = new gx10();
            gx10Var.a = sharedPreferences.getString("flutter_image_picker_error_code", "");
            if (sharedPreferences.contains("flutter_image_picker_error_message")) {
                gx10Var.b = sharedPreferences.getString("flutter_image_picker_error_message", "");
            }
            hx10 hx10Var = new hx10();
            String str = gx10Var.a;
            if (str == null) {
                ny61.r("Nonnull field \"code\" is null.");
                return null;
            }
            hx10Var.a = str;
            hx10Var.b = gx10Var.b;
            hashMap.put("error", hx10Var);
        } else {
            z2 = z;
        }
        if (z2) {
            if (sharedPreferences.contains("flutter_image_picker_type")) {
                hashMap.put("type", sharedPreferences.getString("flutter_image_picker_type", "").equals(MediaStreamTrack.VIDEO_TRACK_KIND) ? Messages.CacheRetrievalType.VIDEO : Messages.CacheRetrievalType.IMAGE);
            }
            gVar = null;
            context = context2;
            if (sharedPreferences.contains("flutter_image_picker_max_width")) {
                hashMap.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0L))));
            }
            if (sharedPreferences.contains("flutter_image_picker_max_height")) {
                hashMap.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0L))));
            }
            hashMap.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
        } else {
            gVar = null;
            context = context2;
        }
        if (hashMap.isEmpty()) {
            return gVar;
        }
        f fVar = new f();
        Messages.CacheRetrievalType cacheRetrievalType = (Messages.CacheRetrievalType) hashMap.get("type");
        if (cacheRetrievalType != null) {
            fVar.a = cacheRetrievalType;
        }
        fVar.b = (hx10) hashMap.get("error");
        ArrayList arrayList = (ArrayList) hashMap.get("pathList");
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                Double d = (Double) hashMap.get("maxWidth");
                Double d2 = (Double) hashMap.get("maxHeight");
                Integer num = (Integer) hashMap.get("imageQuality");
                arrayList2.add(cVar.c.i(str2, d, d2, num == null ? 100 : num.intValue()));
            }
            fVar.c = arrayList2;
        }
        context.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
        g gVar2 = new g();
        Messages.CacheRetrievalType cacheRetrievalType2 = fVar.a;
        if (cacheRetrievalType2 == null) {
            ny61.r("Nonnull field \"type\" is null.");
            return gVar;
        }
        gVar2.a = cacheRetrievalType2;
        gVar2.b = fVar.b;
        ArrayList arrayList3 = fVar.c;
        if (arrayList3 != null) {
            gVar2.c = arrayList3;
            return gVar2;
        }
        ny61.r("Nonnull field \"paths\" is null.");
        return gVar;
    }

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        ssr ssrVar = this.a;
        tt5 tt5Var = ssrVar.c;
        Application application = (Application) ssrVar.a;
        Activity activity = (Activity) ((wrr) l40Var).b;
        e eVar = new e();
        eVar.a = application;
        eVar.b = activity;
        eVar.e = l40Var;
        eVar.f = tt5Var;
        eVar.c = new c(activity, new abe(activity, new omy0()), new a(activity));
        h.a(tt5Var, this);
        eVar.d = new LifeCycleObserver(activity);
        wrr wrrVar = (wrr) l40Var;
        wrrVar.a(eVar.c);
        wrrVar.b(eVar.c);
        Lifecycle lifecycle = ((HiddenLifecycleReference) wrrVar.c).getLifecycle();
        eVar.g = lifecycle;
        lifecycle.a(eVar.d);
        this.b = eVar;
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.a = ssrVar;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        e eVar = this.b;
        if (eVar != null) {
            l40 l40Var = eVar.e;
            if (l40Var != null) {
                ((wrr) l40Var).k(eVar.c);
                l40 l40Var2 = eVar.e;
                ((HashSet) ((wrr) l40Var2).w).remove(eVar.c);
                eVar.e = null;
            }
            Lifecycle lifecycle = eVar.g;
            if (lifecycle != null) {
                lifecycle.d(eVar.d);
                eVar.g = null;
            }
            h.a(eVar.f, null);
            Application application = eVar.a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(eVar.d);
                eVar.a = null;
            }
            eVar.b = null;
            eVar.d = null;
            eVar.c = null;
            this.b = null;
        }
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        this.a = null;
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        onAttachedToActivity(l40Var);
    }
}
