package com.anythink.basead.b.c;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.o;
import java.io.File;
import java.io.FileDescriptor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class h {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f6764a;

        /* renamed from: b, reason: collision with root package name */
        public int f6765b;
    }

    public static a a(String str) {
        a aVar = null;
        try {
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                return null;
            }
            a aVar2 = new a();
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                mediaMetadataRetriever.release();
                aVar2.f6764a = Integer.parseInt(extractMetadata);
                aVar2.f6765b = Integer.parseInt(extractMetadata2);
                return aVar2;
            } catch (Exception e9) {
                e = e9;
                aVar = aVar2;
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    private static a a(FileDescriptor fileDescriptor) {
        a aVar;
        a aVar2 = null;
        if (fileDescriptor == null) {
            return null;
        }
        try {
            aVar = new a();
        } catch (Exception e9) {
            e = e9;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(fileDescriptor);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            mediaMetadataRetriever.release();
            aVar.f6764a = Integer.parseInt(extractMetadata);
            aVar.f6765b = Integer.parseInt(extractMetadata2);
            return aVar;
        } catch (Exception e10) {
            e = e10;
            aVar2 = aVar;
            e.printStackTrace();
            return aVar2;
        }
    }

    private static a a(int i, int i4, int i6, int i9) {
        if (i == 0 || i4 == 0) {
            return null;
        }
        a aVar = new a();
        float f2 = (i * 1.0f) / i4;
        if (f2 < (i6 * 1.0f) / i9) {
            aVar.f6765b = i9;
            aVar.f6764a = (int) (i9 * f2);
            return aVar;
        }
        aVar.f6764a = i6;
        aVar.f6765b = (int) (i6 / f2);
        return aVar;
    }

    private static a a(FileDescriptor fileDescriptor, int i, int i4) {
        a a9 = a(fileDescriptor);
        if (a9 == null) {
            return null;
        }
        if ((a9.f6764a * 1.0f) / a9.f6765b < (i * 1.0f) / i4) {
            a9.f6765b = i4;
            a9.f6764a = (int) Math.ceil(i4 * r0);
            return a9;
        }
        a9.f6764a = i;
        a9.f6765b = (int) Math.ceil(i / r0);
        return a9;
    }

    public static void a(final w wVar, y yVar) {
        if (wVar == null) {
            return;
        }
        synchronized (wVar) {
            try {
                if (!wVar.Y() && !TextUtils.isEmpty(wVar.E())) {
                    wVar.Z();
                    if (wVar.V() <= 0 && wVar.W() <= 0) {
                        if (yVar != null && yVar.F() == 3 && wVar.J() == 1 && TextUtils.equals(yVar.Q(), "2")) {
                            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.h.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
                                    newFixedThreadPool.submit(new Runnable() { // from class: com.anythink.basead.b.c.h.1.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            try {
                                                a a9 = h.a(com.anythink.core.common.res.d.a(t.b().g()).c(4, o.a(w.this.E())));
                                                if (a9 != null) {
                                                    w.this.k(a9.f6764a);
                                                    w.this.l(a9.f6765b);
                                                }
                                            } catch (Throwable unused) {
                                            }
                                            try {
                                                synchronized (newFixedThreadPool) {
                                                    newFixedThreadPool.notifyAll();
                                                }
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                    });
                                    try {
                                        synchronized (newFixedThreadPool) {
                                            newFixedThreadPool.wait(com.anythink.basead.exoplayer.f.f7973a);
                                        }
                                        newFixedThreadPool.shutdownNow();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }, 2);
                        }
                    }
                }
            } finally {
            }
        }
    }
}
