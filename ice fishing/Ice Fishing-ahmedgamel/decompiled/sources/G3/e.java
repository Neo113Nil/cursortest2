package G3;

import A1.E;
import A1.x;
import A1.y;
import D1.G;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C3786q5;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k2.InterfaceC4642a;
import m3.AbstractC4742a;
import o1.C4798b;
import o1.C4800d;
import r0.InterfaceC4894c;
import w1.w;

/* loaded from: classes2.dex */
public class e implements A2.b, y, G, u1.k, Q1.c, com.bumptech.glide.manager.g, com.bumptech.glide.manager.l, InterfaceC4642a, InterfaceC4894c, u1.f, Q1.a {

    /* renamed from: u, reason: collision with root package name */
    public static e f1076u;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1077n;

    public /* synthetic */ e(int i) {
        this.f1077n = i;
    }

    public static final String n(y8.h hVar, y8.h[] hVarArr, int i) {
        int i4;
        boolean z6;
        int i6;
        int i9;
        int i10 = -1;
        y8.h hVar2 = v8.a.f41226b;
        int a9 = hVar.a();
        int i11 = 0;
        while (i11 < a9) {
            int i12 = (i11 + a9) / 2;
            while (i12 > i10 && hVar.e(i12) != 10) {
                i12 += i10;
            }
            int i13 = i12 + 1;
            int i14 = 1;
            while (true) {
                i4 = i13 + i14;
                if (hVar.e(i4) == 10) {
                    break;
                }
                i14++;
            }
            int i15 = i4 - i13;
            int i16 = i;
            boolean z9 = false;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (z9) {
                    i6 = 46;
                    z6 = false;
                } else {
                    byte e9 = hVarArr[i16].e(i17);
                    byte[] bArr = j8.c.f38494a;
                    int i19 = e9 & 255;
                    z6 = z9;
                    i6 = i19;
                }
                byte e10 = hVar.e(i13 + i18);
                byte[] bArr2 = j8.c.f38494a;
                i9 = i6 - (e10 & 255);
                if (i9 != 0) {
                    break;
                }
                i18++;
                i17++;
                if (i18 == i15) {
                    break;
                }
                if (hVarArr[i16].a() != i17) {
                    z9 = z6;
                } else {
                    if (i16 == hVarArr.length - 1) {
                        break;
                    }
                    i16++;
                    z9 = true;
                    i17 = -1;
                }
            }
            if (i9 >= 0) {
                if (i9 <= 0) {
                    int i20 = i15 - i18;
                    int a10 = hVarArr[i16].a() - i17;
                    int length = hVarArr.length;
                    for (int i21 = i16 + 1; i21 < length; i21++) {
                        a10 += hVarArr[i21].a();
                    }
                    if (a10 >= i20) {
                        if (a10 <= i20) {
                            return hVar.i(i13, i15 + i13).h(Q7.a.f2701a);
                        }
                    }
                }
                i11 = i4 + 1;
                i10 = -1;
            }
            a9 = i12;
            i10 = -1;
        }
        return null;
    }

    public static ArrayList o(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new n1.d((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static e p(Context context, int i) {
        A8.b.c("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC4742a.f39429m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        com.bumptech.glide.f.j(context, obtainStyledAttributes, 4);
        com.bumptech.glide.f.j(context, obtainStyledAttributes, 9);
        com.bumptech.glide.f.j(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a(0)).a();
        obtainStyledAttributes.recycle();
        e eVar = new e(19);
        A8.b.d(rect.left);
        A8.b.d(rect.top);
        A8.b.d(rect.right);
        A8.b.d(rect.bottom);
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean r(c0.b bVar, Editable editable, int i, int i4, boolean z6) {
        int min;
        if (editable != null && i >= 0 && i4 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z6) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z9 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z9) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z9 = true;
                                    }
                                } else if (!z9) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i4, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z10 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z10) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z10 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i4, editable.length());
                }
                androidx.emoji2.text.v[] vVarArr = (androidx.emoji2.text.v[]) editable.getSpans(selectionStart, min, androidx.emoji2.text.v.class);
                if (vVarArr != null && vVarArr.length > 0) {
                    for (androidx.emoji2.text.v vVar : vVarArr) {
                        int spanStart = editable.getSpanStart(vVar);
                        int spanEnd = editable.getSpanEnd(vVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // u1.k
    public int b(u1.h hVar) {
        return 1;
    }

    @Override // u1.InterfaceC5063b
    public boolean c(Object obj, File file, u1.h hVar) {
        try {
            P1.b.d(((H1.h) ((H1.c) ((w) obj).get()).f1199n.f644b).f1216a.f40864d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e9) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e9);
            return false;
        }
    }

    @Override // Q1.a
    public Object e() {
        return new w1.v();
    }

    @Override // k2.InterfaceC4642a
    public long f() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.bumptech.glide.manager.g
    public void h(com.bumptech.glide.manager.h hVar) {
        hVar.onStart();
    }

    @Override // A1.y
    public x j(E e9) {
        return new A1.G(e9.a(A1.m.class, InputStream.class), 1);
    }

    @Override // D1.G
    public void k(MediaExtractor mediaExtractor, Object obj) {
        switch (this.f1077n) {
            case 3:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // D1.G
    public void m(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f1077n) {
            case 3:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    public C4798b q(C4800d c4800d, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(Collections.EMPTY_MAP);
        URL url = new URL(c4800d.f39738u);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i = c4800d.f39732C.f2221a;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        boolean z6 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            httpURLConnection.setRequestMethod("GET");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                C4798b c4798b = new C4798b(responseCode, o(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return c4798b;
            }
            try {
                try {
                    return new C4798b(responseCode, o(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new C3786q5(httpURLConnection, 1));
                } catch (Throwable th) {
                    th = th;
                    z6 = true;
                    if (!z6) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public e(RecyclerView recyclerView) {
        this.f1077n = 25;
    }

    @Override // r0.InterfaceC4894c
    public void g() {
    }

    @Override // com.bumptech.glide.manager.g
    public void i(com.bumptech.glide.manager.h hVar) {
    }

    @Override // Q1.c
    public void l(Object obj) {
    }

    @Override // r0.InterfaceC4894c
    public void a(int i, Serializable serializable) {
    }

    @Override // u1.f
    public void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
