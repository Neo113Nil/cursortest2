package com.anythink.core.common.res.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.res.a.b;
import com.anythink.core.common.res.d;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.o;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f16114b = "H5TemplateLoader";

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f16115c;

    /* renamed from: a, reason: collision with root package name */
    Context f16116a;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap<String, List<InterfaceC0093a>> f16117d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<String, Long> f16118e = new ConcurrentHashMap<>();

    /* renamed from: com.anythink.core.common.res.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0093a {
        void a(String str, int i, String str2);

        void a(String str, String str2, long j6);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f16135a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f16136b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f16137c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f16138d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f16139e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f16140f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f16141g = 7;
    }

    private a(Context context) {
        if (context != null) {
            this.f16116a = context.getApplicationContext();
        } else {
            this.f16116a = t.b().g();
        }
    }

    private void b(String str) {
        String a9 = d.a(this.f16116a).a(str);
        if (TextUtils.isEmpty(a9)) {
            a(str, 3, "h5temp html file not exist");
        } else {
            a(str, a9);
        }
    }

    /* renamed from: com.anythink.core.common.res.a.a$3, reason: invalid class name */
    public class AnonymousClass3 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f16132a;

        public AnonymousClass3(e eVar) {
            this.f16132a = eVar;
        }

        @Override // com.anythink.core.common.res.a.b.a
        public final void a(e eVar) {
            String str = eVar.f16235h;
            a.this.a(this.f16132a.f16235h);
        }

        @Override // com.anythink.core.common.res.a.b.a
        public final void a(e eVar, String str) {
            a.this.a(eVar.f16235h, 1, str);
        }
    }

    public static a a(Context context) {
        if (f16115c == null) {
            synchronized (a.class) {
                try {
                    if (f16115c == null) {
                        f16115c = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16115c;
    }

    private void a(String str, String str2) {
        final String str3;
        final String str4;
        synchronized (this.f16117d) {
            File file = new File(d.a(this.f16116a).c(5, o.a(str)));
            if (file.exists()) {
                file.delete();
            }
            try {
                LinkedList linkedList = (LinkedList) this.f16117d.remove(str);
                if (linkedList != null) {
                    Long l9 = this.f16118e.get(str);
                    final long currentTimeMillis = l9 != null ? System.currentTimeMillis() - l9.longValue() : 0L;
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        final InterfaceC0093a interfaceC0093a = (InterfaceC0093a) it.next();
                        if (interfaceC0093a != null) {
                            str3 = str;
                            str4 = str2;
                            t.b().b(new Runnable() { // from class: com.anythink.core.common.res.a.a.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (TextUtils.isEmpty(str4)) {
                                        interfaceC0093a.a(str3, 3, "H5Template load fail:h5TemplateFilePath is empty");
                                    } else {
                                        interfaceC0093a.a(str3, str4, currentTimeMillis);
                                    }
                                }
                            });
                        } else {
                            str3 = str;
                            str4 = str2;
                        }
                        str2 = str4;
                        str = str3;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i, String str2) {
        final String str3;
        final int i6;
        final String str4;
        synchronized (this.f16117d) {
            try {
                String a9 = o.a(str);
                File file = new File(d.a(this.f16116a).c(5, a9));
                if (file.exists()) {
                    file.delete();
                }
                File file2 = new File(d.a(this.f16116a).c(6, a9));
                if (file2.exists()) {
                    file2.delete();
                }
                LinkedList linkedList = (LinkedList) this.f16117d.remove(str);
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        final InterfaceC0093a interfaceC0093a = (InterfaceC0093a) it.next();
                        if (interfaceC0093a != null) {
                            str3 = str;
                            i6 = i;
                            str4 = str2;
                            t.b().b(new Runnable() { // from class: com.anythink.core.common.res.a.a.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    interfaceC0093a.a(str3, i6, str4);
                                }
                            });
                        } else {
                            str3 = str;
                            i6 = i;
                            str4 = str2;
                        }
                        str = str3;
                        i = i6;
                        str2 = str4;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str, InterfaceC0093a interfaceC0093a) {
        if (TextUtils.isEmpty(str)) {
            interfaceC0093a.a(str, 1, "No url info.");
            return;
        }
        if (!str.endsWith(".zip")) {
            interfaceC0093a.a(str, 1, "Not zip file url");
            return;
        }
        String a9 = d.a(t.b().g()).a(str);
        if (!TextUtils.isEmpty(a9)) {
            interfaceC0093a.a(str, a9, 0L);
            return;
        }
        synchronized (this.f16117d) {
            try {
                if (!this.f16118e.contains(str)) {
                    this.f16118e.put(str, Long.valueOf(System.currentTimeMillis()));
                }
                if (!this.f16117d.containsKey(str)) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(interfaceC0093a);
                    this.f16117d.put(str, linkedList);
                    if (d.a(t.b().g()).b(5, o.a(str))) {
                        a(str);
                    } else {
                        e eVar = new e(5, str);
                        com.anythink.core.common.res.a.b bVar = new com.anythink.core.common.res.a.b(eVar);
                        bVar.f16143b = new AnonymousClass3(eVar);
                        bVar.d();
                    }
                    return;
                }
                LinkedList linkedList2 = (LinkedList) this.f16117d.get(str);
                if (linkedList2 != null && !linkedList2.contains(interfaceC0093a)) {
                    linkedList2.add(interfaceC0093a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(e eVar) {
        com.anythink.core.common.res.a.b bVar = new com.anythink.core.common.res.a.b(eVar);
        bVar.f16143b = new AnonymousClass3(eVar);
        bVar.d();
    }

    private void a() {
        try {
            ConcurrentHashMap<String, List<InterfaceC0093a>> concurrentHashMap = this.f16117d;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        String a9 = o.a(str);
        String c9 = d.a(this.f16116a).c(5, a9);
        String c10 = d.a(this.f16116a).c(6, a9);
        File file = new File(c10);
        if (file.exists()) {
            file.delete();
        }
        new com.anythink.core.common.v.a();
        if (com.anythink.core.common.v.a.a(c9, c10) == 0) {
            b(str);
        } else {
            a(str, 2, "H5temp url unzip fail");
        }
    }
}
