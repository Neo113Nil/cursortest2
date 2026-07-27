package com.anythink.core.common.res;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.res.image.a;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.o;
import java.io.FileInputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f16155b = "ImageLoader";

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f16156c;

    /* renamed from: a, reason: collision with root package name */
    Context f16157a;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Integer> f16158d;

    /* renamed from: f, reason: collision with root package name */
    private final Object f16160f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap<String, List<a>> f16161g = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private c<String, SoftReference<Bitmap>> f16159e = new c<String, SoftReference<Bitmap>>(((int) Runtime.getRuntime().maxMemory()) / 5) { // from class: com.anythink.core.common.res.b.3
        @Override // com.anythink.core.common.res.c
        public final /* synthetic */ int a(String str, SoftReference<Bitmap> softReference) {
            String str2 = str;
            SoftReference<Bitmap> softReference2 = softReference;
            Bitmap bitmap = softReference2 != null ? softReference2.get() : null;
            if (b.this.f16158d == null) {
                b.this.f16158d = new HashMap(8);
            }
            if (bitmap != null) {
                int height = bitmap.getHeight() * bitmap.getRowBytes();
                b.this.f16158d.put(str2, Integer.valueOf(height));
                return height;
            }
            Integer num = (Integer) b.this.f16158d.get(str2);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        @Override // com.anythink.core.common.res.c
        public final /* synthetic */ void a(boolean z3, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
            Bitmap bitmap;
            String str2 = str;
            SoftReference<Bitmap> softReference3 = softReference;
            SoftReference<Bitmap> softReference4 = softReference2;
            super.a(z3, (boolean) str2, softReference3, softReference4);
            if (softReference3 != null) {
                try {
                    bitmap = softReference3.get();
                } catch (Exception unused) {
                    return;
                }
            } else {
                bitmap = null;
            }
            if (b.this.f16158d != null) {
                b.this.f16158d.remove(str2);
            }
            if (softReference3 == null || softReference3.equals(softReference4) || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private int a2(String str, SoftReference<Bitmap> softReference) {
            Bitmap bitmap = softReference != null ? softReference.get() : null;
            if (b.this.f16158d == null) {
                b.this.f16158d = new HashMap(8);
            }
            if (bitmap == null) {
                Integer num = (Integer) b.this.f16158d.get(str);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            }
            int height = bitmap.getHeight() * bitmap.getRowBytes();
            b.this.f16158d.put(str, Integer.valueOf(height));
            return height;
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(boolean z3, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
            Bitmap bitmap;
            super.a(z3, (boolean) str, softReference, softReference2);
            if (softReference != null) {
                try {
                    bitmap = softReference.get();
                } catch (Exception unused) {
                    return;
                }
            } else {
                bitmap = null;
            }
            if (b.this.f16158d != null) {
                b.this.f16158d.remove(str);
            }
            if (softReference == null || softReference.equals(softReference2) || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }
    };

    /* renamed from: com.anythink.core.common.res.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f16162a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f16163b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f16164c;

        public AnonymousClass1(Bitmap bitmap, a aVar, String str) {
            this.f16162a = bitmap;
            this.f16163b = aVar;
            this.f16164c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap = this.f16162a;
            if (bitmap != null) {
                this.f16163b.onSuccess(this.f16164c, bitmap);
            } else {
                this.f16163b.onFail(this.f16164c, "Bitmap load fail");
            }
        }
    }

    /* renamed from: com.anythink.core.common.res.b$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f16166a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16167b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f16168c;

        public AnonymousClass2(a aVar, String str, String str2) {
            this.f16166a = aVar;
            this.f16167b = str;
            this.f16168c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f16166a.onFail(this.f16167b, this.f16168c);
        }
    }

    public interface a {
        void onFail(String str, String str2);

        void onSuccess(String str, Bitmap bitmap);
    }

    private b(Context context) {
        this.f16157a = context.getApplicationContext();
    }

    private void b(String str, Bitmap bitmap) {
        synchronized (this.f16161g) {
            try {
                LinkedList linkedList = (LinkedList) this.f16161g.remove(str);
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar != null) {
                            t.b().b(new AnonymousClass1(bitmap, aVar, str));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a(String str, String str2) {
        synchronized (this.f16161g) {
            try {
                LinkedList linkedList = (LinkedList) this.f16161g.remove(str);
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar != null) {
                            t.b().b(new AnonymousClass2(aVar, str, str2));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: com.anythink.core.common.res.b$5, reason: invalid class name */
    public class AnonymousClass5 implements a.InterfaceC0096a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16176a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f16177b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f16178c;

        public AnonymousClass5(int i, int i6, e eVar) {
            this.f16176a = i;
            this.f16177b = i6;
            this.f16178c = eVar;
        }

        @Override // com.anythink.core.common.res.image.a.InterfaceC0096a
        public final void a(e eVar) {
            String str = eVar.f16235h;
            Bitmap a9 = b.this.a(eVar, this.f16176a, this.f16177b);
            if (a9 != null) {
                b.this.a(eVar.f16235h, a9);
            }
            b.a(b.this, this.f16178c.f16235h, a9);
        }

        @Override // com.anythink.core.common.res.image.a.InterfaceC0096a
        public final void a(e eVar, String str) {
            b.a(b.this, eVar.f16235h, str);
        }
    }

    public final Bitmap b(e eVar, int i, int i6) {
        if (TextUtils.isEmpty(eVar.f16235h)) {
            return null;
        }
        Bitmap a9 = a(eVar.f16235h);
        if (a9 != null && !a9.isRecycled()) {
            return a9;
        }
        Bitmap a10 = a(eVar, i, i6);
        if (a10 == null || a10.isRecycled()) {
            return null;
        }
        a(eVar.f16235h, a10);
        return a10;
    }

    public final void a(String str, Bitmap bitmap) {
        if (a(str) != null || bitmap == null) {
            return;
        }
        this.f16159e.b(str, new SoftReference<>(bitmap));
    }

    private Bitmap a(String str) {
        SoftReference<Bitmap> a9 = this.f16159e.a((c<String, SoftReference<Bitmap>>) str);
        if (a9 != null) {
            return a9.get();
        }
        return null;
    }

    public final Bitmap a(e eVar, int i, int i6) {
        Bitmap bitmap = null;
        if (eVar == null || TextUtils.isEmpty(eVar.f16235h)) {
            return null;
        }
        String a9 = o.a(eVar.f16235h);
        if (i <= 0) {
            try {
                i = this.f16157a.getResources().getDisplayMetrics().widthPixels;
            } catch (Throwable unused) {
            }
        }
        if (i6 <= 0) {
            i6 = this.f16157a.getResources().getDisplayMetrics().heightPixels;
        }
        synchronized (this.f16160f) {
            FileInputStream a10 = d.a(this.f16157a).a(eVar.f16234g, a9);
            if (a10 == null) {
                return null;
            }
            try {
                bitmap = h.a(a10.getFD(), i, i6);
            } catch (Throwable unused2) {
            }
            try {
                a10.close();
            } catch (Exception unused3) {
            }
            return bitmap;
        }
    }

    private void b(e eVar, int i, int i6, a aVar) {
        synchronized (this.f16161g) {
            try {
                if (!this.f16161g.containsKey(eVar.f16235h)) {
                    if (aVar != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(aVar);
                        this.f16161g.put(eVar.f16235h, linkedList);
                    }
                    com.anythink.core.common.res.image.a aVar2 = new com.anythink.core.common.res.image.a(eVar);
                    aVar2.a(new AnonymousClass5(i, i6, eVar));
                    aVar2.d();
                } else {
                    LinkedList linkedList2 = (LinkedList) this.f16161g.get(eVar.f16235h);
                    if (linkedList2 != null && aVar != null && !linkedList2.contains(aVar)) {
                        linkedList2.add(aVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static b a(Context context) {
        if (f16156c == null) {
            synchronized (b.class) {
                try {
                    if (f16156c == null) {
                        f16156c = new b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16156c;
    }

    public final void a(e eVar, a aVar) {
        a(eVar, -1, -1, aVar);
    }

    public final void a(final e eVar, final int i, final int i6, final a aVar) {
        if (eVar == null || TextUtils.isEmpty(eVar.f16235h)) {
            if (aVar != null) {
                aVar.onFail("", "No url info.");
                return;
            }
            return;
        }
        Bitmap a9 = a(eVar.f16235h);
        if (a9 == null || a9.isRecycled() || (a9.getWidth() < i && a9.getHeight() < i6)) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.res.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap a10 = b.this.a(eVar, i, i6);
                    if (a10 == null || a10.isRecycled()) {
                        b.a(b.this, eVar, i, i6, aVar);
                        return;
                    }
                    b.this.a(eVar.f16235h, a10);
                    if (aVar != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(aVar);
                        b.this.f16161g.put(eVar.f16235h, linkedList);
                    }
                    b.a(b.this, eVar.f16235h, a10);
                }
            }, 2);
        } else if (aVar != null) {
            aVar.onSuccess(eVar.f16235h, a9);
        }
    }

    private void a() {
        try {
            c<String, SoftReference<Bitmap>> cVar = this.f16159e;
            if (cVar != null) {
                cVar.a();
            }
            ConcurrentHashMap<String, List<a>> concurrentHashMap = this.f16161g;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void a(b bVar, String str, Bitmap bitmap) {
        synchronized (bVar.f16161g) {
            try {
                LinkedList linkedList = (LinkedList) bVar.f16161g.remove(str);
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar != null) {
                            t.b().b(bVar.new AnonymousClass1(bitmap, aVar, str));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void a(b bVar, e eVar, int i, int i6, a aVar) {
        synchronized (bVar.f16161g) {
            try {
                if (!bVar.f16161g.containsKey(eVar.f16235h)) {
                    if (aVar != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(aVar);
                        bVar.f16161g.put(eVar.f16235h, linkedList);
                    }
                    com.anythink.core.common.res.image.a aVar2 = new com.anythink.core.common.res.image.a(eVar);
                    aVar2.a(bVar.new AnonymousClass5(i, i6, eVar));
                    aVar2.d();
                } else {
                    LinkedList linkedList2 = (LinkedList) bVar.f16161g.get(eVar.f16235h);
                    if (linkedList2 != null && aVar != null && !linkedList2.contains(aVar)) {
                        linkedList2.add(aVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void a(b bVar, String str, String str2) {
        synchronized (bVar.f16161g) {
            try {
                LinkedList linkedList = (LinkedList) bVar.f16161g.remove(str);
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar != null) {
                            t.b().b(bVar.new AnonymousClass2(aVar, str, str2));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
