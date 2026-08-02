package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.nfc.tech.MifareClassic;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.Choreographer;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassifier;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import androidx.compose.ui.node.s;
import com.yandex.fintechsdk.core.nfc.impl.internal.exception.DetectedTypeReadingException;
import com.yandex.go.coroutines.b;
import com.yandex.go.image.api.domain.models.ImageSource;
import com.yandex.go.summary.interactor.anchored.state.content.AuctionUiStateInteractor$special$$inlined$start$1;
import com.yandex.go.summary.interactor.anchored.state.content.c;
import com.yandex.go.taxi.auction.domain.a;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.internal.avatar.AvatarPlaceholderDrawable;
import com.yandex.messaging.internal.entities.VideoMessageData;
import com.yandex.messaging.internal.view.timeline.f;
import com.yandex.messaging.views.LimitedRoundFrameLayout;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;
import ru.yandex.taxi.utils.d;
import ru.yandex.taxi.widget.dialog.AlertDialogModalView;
import ru.yandex.taxi.widget.dialog.Toggleable;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;
import yads.m30;
import yads.wm0;

/* loaded from: classes13.dex */
public class ymu implements ix1, es2, iqs, xbi0, tgc0, e170, qt5, yh5, ryj0, f16, r2v {
    public static final ymu w;
    public static final String[] x = {"name", "length", "last_touch_timestamp"};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    static {
        Object obj = null;
        w = new ymu(1, obj, obj);
    }

    public ymu(wiq0 wiq0Var, a aVar, zuj0 zuj0Var) {
        this.a = 14;
        this.b = zuj0Var;
        this.c = e.t(b.d(new com.yandex.go.summary.interactor.anchored.state.content.e(aVar.a(new c(e.s(((k) wiq0Var).j.b(), new zbd(17)))), this), new AuctionUiStateInteractor$special$$inlined$start$1(null, null)));
    }

    public static ymu k(ymu ymuVar, s sVar, dry0 dry0Var, int i) {
        Object obj = sVar;
        if ((i & 1) != 0) {
            obj = (rzx) ymuVar.b;
        }
        if ((i & 2) != 0) {
            dry0Var = (dry0) ymuVar.c;
        }
        return new ymu(1, obj, dry0Var);
    }

    public void A(int[] iArr, int i) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public void B(int i) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeWithDefaults(i);
    }

    public void C(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    public void D(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public void E(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    public void F(long j) {
        for (uyl0 uyl0Var : (uyl0[]) this.c) {
            if (uyl0Var.F != j) {
                uyl0Var.F = j;
                uyl0Var.z = true;
            }
        }
    }

    public void G(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }

    public void H(String str, String str2) {
        ((com.yandex.div.core.expression.variables.a) this.b).i(new z131(str, str2));
    }

    public void I(ag1 ag1Var) {
        this.c = ag1Var;
    }

    public void J(ru.yandex.taxi.communications.api.dto.ticket.a aVar, String str, sls slsVar) {
        byte b = 0;
        ((pep0) ((oep0) this.b)).f(new yn5(b, (p2z0) ((yvf0) this.c).get(), slsVar), new o2z0(aVar, str != null ? new mf1(b, 21, str) : null), hxx.a);
    }

    public g001 K(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                lk91.e("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new coj();
            }
            if (i == iArr[i2]) {
                return ((uyl0[]) this.c)[i2];
            }
            i2++;
        }
    }

    @Override // defpackage.ix1
    public kzv a(ArrayList arrayList) {
        vy60 vy60Var = (vy60) this.b;
        double d = vy60Var.a;
        double d2 = vy60Var.b;
        TimestampSelector timestampSelector = (TimestampSelector) this.c;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            ny61.p();
            return null;
        }
        ajc ajcVar = ((kzv) it.next()).b.a;
        while (it.hasNext()) {
            ajc ajcVar2 = ((kzv) it.next()).b.a;
            if (timestampSelector.compare(ajcVar, ajcVar2) < 0) {
                ajcVar = ajcVar2;
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            ny61.p();
            return null;
        }
        Object next = it2.next();
        if (it2.hasNext()) {
            k7z k7zVar = ((kzv) next).b;
            long a = timestampSelector.a(ajcVar, k7zVar.a);
            u1k u1kVar = k7zVar.b.b;
            u1k u1kVar2 = new u1k((e3n.m(a, DurationUnit.SECONDS) * d) + (u1kVar != null ? u1kVar.a : d2));
            do {
                Object next2 = it2.next();
                k7z k7zVar2 = ((kzv) next2).b;
                long a2 = timestampSelector.a(ajcVar, k7zVar2.a);
                u1k u1kVar3 = k7zVar2.b.b;
                u1k u1kVar4 = new u1k((e3n.m(a2, DurationUnit.SECONDS) * d) + (u1kVar3 != null ? u1kVar3.a : d2));
                if (u1kVar2.compareTo(u1kVar4) > 0) {
                    next = next2;
                    u1kVar2 = u1kVar4;
                }
            } while (it2.hasNext());
        }
        return (kzv) next;
    }

    @Override // defpackage.f16
    public void b(Bitmap bitmap, ebv ebvVar, ImageSource imageSource) {
        ((zls) this.c).invoke(bitmap, ebvVar, imageSource);
    }

    public void c(int i, float f) {
    }

    @Override // defpackage.e170
    public void d(int i) {
        f fVar = (f) this.b;
        r6e r6eVar = fVar.B2;
        int i2 = i - fVar.v3;
        VideoMessageData videoMessageData = (VideoMessageData) this.c;
        Point a = r6eVar.a(i2, Integer.valueOf(videoMessageData.width), Integer.valueOf(videoMessageData.height));
        if (fVar.H3) {
            return;
        }
        final int i3 = 1;
        fVar.H3 = true;
        LimitedRoundFrameLayout limitedRoundFrameLayout = fVar.C2;
        ViewGroup.LayoutParams layoutParams = limitedRoundFrameLayout.getLayoutParams();
        layoutParams.width = a.x;
        layoutParams.height = a.y;
        limitedRoundFrameLayout.setLayoutParams(layoutParams);
        final jm31 jm31Var = (jm31) fVar.B3.getValue();
        ImageView imageView = fVar.T2;
        int i4 = a.x;
        int i5 = a.y;
        xav xavVar = jm31Var.b;
        pzt0 pzt0Var = jm31Var.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = jm31Var.f;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        byte[] bArr = videoMessageData.thumbHash;
        if (bArr != null) {
            yn50 yn50Var = (yn50) xavVar.load("thumbhash://hash/" + Base64.encodeToString(bArr, 10));
            xn50 xn50Var = yn50Var.b;
            xn50Var.i = i4;
            xn50Var.j = i5;
            final int i6 = 0;
            jm31Var.e = com.yandex.messaging.extension.a.a(yn50Var, imageView, jm31Var.a, new tls() { // from class: im31
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i7 = i6;
                    em31 em31Var = em31.a;
                    zy11 zy11Var = zy11.a;
                    jm31 jm31Var2 = jm31Var;
                    switch (i7) {
                        case 0:
                            r0 r0Var = jm31Var2.c;
                            r0Var.getClass();
                            r0Var.m(null, em31Var);
                            break;
                        case 1:
                            r0 r0Var2 = jm31Var2.c;
                            r0Var2.getClass();
                            r0Var2.m(null, dm31.a);
                            break;
                        case 2:
                            r0 r0Var3 = jm31Var2.c;
                            r0Var3.getClass();
                            r0Var3.m(null, em31Var);
                            break;
                        default:
                            Uri uri = (Uri) obj;
                            r0 r0Var4 = jm31Var2.c;
                            fm31 fm31Var = new fm31(uri != null ? uri.toString() : null);
                            r0Var4.getClass();
                            r0Var4.m(null, fm31Var);
                            break;
                    }
                    return zy11Var;
                }
            }, null, new tls() { // from class: im31
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i7 = i3;
                    em31 em31Var = em31.a;
                    zy11 zy11Var = zy11.a;
                    jm31 jm31Var2 = jm31Var;
                    switch (i7) {
                        case 0:
                            r0 r0Var = jm31Var2.c;
                            r0Var.getClass();
                            r0Var.m(null, em31Var);
                            break;
                        case 1:
                            r0 r0Var2 = jm31Var2.c;
                            r0Var2.getClass();
                            r0Var2.m(null, dm31.a);
                            break;
                        case 2:
                            r0 r0Var3 = jm31Var2.c;
                            r0Var3.getClass();
                            r0Var3.m(null, em31Var);
                            break;
                        default:
                            Uri uri = (Uri) obj;
                            r0 r0Var4 = jm31Var2.c;
                            fm31 fm31Var = new fm31(uri != null ? uri.toString() : null);
                            r0Var4.getClass();
                            r0Var4.m(null, fm31Var);
                            break;
                    }
                    return zy11Var;
                }
            }, 8);
        }
        String str = videoMessageData.fileId;
        if (str != null) {
            String str2 = str.length() > 0 ? str : null;
            if (str2 == null) {
                return;
            }
            yn50 yn50Var2 = (yn50) xavVar.load(com.yandex.messaging.internal.images.b.f(str2));
            xn50 xn50Var2 = yn50Var2.b;
            xn50Var2.i = i4;
            xn50Var2.j = i5;
            xn50Var2.f = true;
            tse tseVar = jm31Var.a;
            final int i7 = 2;
            tls tlsVar = new tls() { // from class: im31
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i72 = i7;
                    em31 em31Var = em31.a;
                    zy11 zy11Var = zy11.a;
                    jm31 jm31Var2 = jm31Var;
                    switch (i72) {
                        case 0:
                            r0 r0Var = jm31Var2.c;
                            r0Var.getClass();
                            r0Var.m(null, em31Var);
                            break;
                        case 1:
                            r0 r0Var2 = jm31Var2.c;
                            r0Var2.getClass();
                            r0Var2.m(null, dm31.a);
                            break;
                        case 2:
                            r0 r0Var3 = jm31Var2.c;
                            r0Var3.getClass();
                            r0Var3.m(null, em31Var);
                            break;
                        default:
                            Uri uri = (Uri) obj;
                            r0 r0Var4 = jm31Var2.c;
                            fm31 fm31Var = new fm31(uri != null ? uri.toString() : null);
                            r0Var4.getClass();
                            r0Var4.m(null, fm31Var);
                            break;
                    }
                    return zy11Var;
                }
            };
            final int i8 = 3;
            jm31Var.f = com.yandex.messaging.extension.a.a(yn50Var2, imageView, tseVar, tlsVar, null, new tls() { // from class: im31
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i72 = i8;
                    em31 em31Var = em31.a;
                    zy11 zy11Var = zy11.a;
                    jm31 jm31Var2 = jm31Var;
                    switch (i72) {
                        case 0:
                            r0 r0Var = jm31Var2.c;
                            r0Var.getClass();
                            r0Var.m(null, em31Var);
                            break;
                        case 1:
                            r0 r0Var2 = jm31Var2.c;
                            r0Var2.getClass();
                            r0Var2.m(null, dm31.a);
                            break;
                        case 2:
                            r0 r0Var3 = jm31Var2.c;
                            r0Var3.getClass();
                            r0Var3.m(null, em31Var);
                            break;
                        default:
                            Uri uri = (Uri) obj;
                            r0 r0Var4 = jm31Var2.c;
                            fm31 fm31Var = new fm31(uri != null ? uri.toString() : null);
                            r0Var4.getClass();
                            r0Var4.m(null, fm31Var);
                            break;
                    }
                    return zy11Var;
                }
            }, 8);
        }
    }

    public HashMap e() {
        try {
            ((String) this.c).getClass();
            Cursor query = ((wm0) this.b).getReadableDatabase().query((String) this.c, x, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new t471(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (Throwable th) {
            throw new m30(th);
        }
    }

    public void f(long j) {
        wm0 wm0Var = (wm0) this.b;
        try {
            String hexString = Long.toHexString(j);
            this.c = "ExoPlayerCacheFileMetadata" + hexString;
            if (ye81.a(wm0Var.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = wm0Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    ye81.b(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.c));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.c) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th) {
            throw new m30(th);
        }
    }

    public void g(long j, long j2, String str) {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((wm0) this.b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.c, null, contentValues);
        } catch (Throwable th) {
            throw new m30(th);
        }
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        return ((AtomicReference) this.c).get();
    }

    public void h(Set set) {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((wm0) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.c, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            throw new m30(th2);
        }
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        ((ryj0) this.c).i((PaymentKitError) obj);
    }

    public bi1 j() {
        Integer num = (Integer) this.b;
        if (num != null) {
            return new bi1(num.intValue(), (ag1) this.c);
        }
        kbs.v("Key size is not set");
        return null;
    }

    public AvatarPlaceholderDrawable l(String str, String str2, Drawable drawable, jb4 jb4Var) {
        return new AvatarPlaceholderDrawable((za4) this.b, (mp11) this.c, str, str2, drawable, jb4Var);
    }

    public AlertDialogModalView m(hr1 hr1Var) {
        AlertDialogModalView alertDialogModalView = new AlertDialogModalView((Context) this.b, (d) this.c, hr1Var.c, hr1Var.h, hr1Var.i);
        Toggleable toggleable = hr1Var.a;
        int[] iArr = gr1.a;
        int i = iArr[toggleable.ordinal()];
        final int i2 = 1;
        if (i == 1) {
            alertDialogModalView.setupBackButton();
        } else if (i != 2) {
            w511.b();
            return null;
        }
        int i3 = iArr[hr1Var.b.ordinal()];
        if (i3 == 1) {
            alertDialogModalView.dismissOnTouchOutsideOn();
        } else {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            alertDialogModalView.dismissOnTouchOutsideOff();
        }
        CharSequence charSequence = hr1Var.d;
        if (charSequence != null) {
            alertDialogModalView.setTitle(charSequence);
        }
        CharSequence charSequence2 = hr1Var.e;
        if (charSequence2 != null) {
            alertDialogModalView.setDescription(charSequence2);
        }
        final q1c q1cVar = hr1Var.f;
        if (q1cVar != null) {
            final int i4 = 0;
            alertDialogModalView.setupAdditionalButton(q1cVar.a, new sls() { // from class: fr1
                @Override // defpackage.sls
                public final Object invoke() {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    q1c q1cVar2 = q1cVar;
                    switch (i5) {
                        case 0:
                            q1cVar2.b.run();
                            break;
                        default:
                            q1cVar2.b.run();
                            break;
                    }
                    return zy11Var;
                }
            });
        }
        final q1c q1cVar2 = hr1Var.g;
        if (q1cVar2 != null) {
            alertDialogModalView.setupMainButton(q1cVar2.a, new sls() { // from class: fr1
                @Override // defpackage.sls
                public final Object invoke() {
                    int i5 = i2;
                    zy11 zy11Var = zy11.a;
                    q1c q1cVar22 = q1cVar2;
                    switch (i5) {
                        case 0:
                            q1cVar22.b.run();
                            break;
                        default:
                            q1cVar22.b.run();
                            break;
                    }
                    return zy11Var;
                }
            });
        }
        return alertDialogModalView;
    }

    public boolean n(int i) {
        return i == 8 || i == 26 || i == 27;
    }

    public List o() {
        k020 k020Var = (k020) this.c;
        return k020Var.b.f0().b(((naz0) this.b).a.a);
    }

    @Override // defpackage.f16
    public void onError(Throwable th) {
        ((tls) this.b).invoke(th);
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        androidx.camera.video.internal.audio.d dVar = (androidx.camera.video.internal.audio.d) this.c;
        if (dVar.l != ((fzn) this.b)) {
            return;
        }
        sgb1.g(3, "AudioSource");
        if (th instanceof IllegalStateException) {
            return;
        }
        Executor executor = dVar.j;
        o8g0 o8g0Var = dVar.k;
        if (executor == null || o8g0Var == null) {
            return;
        }
        executor.execute(new hc(29, o8g0Var, th));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 15:
                czn cznVar = (czn) obj;
                androidx.camera.video.internal.audio.d dVar = (androidx.camera.video.internal.audio.d) this.c;
                boolean z = dVar.i;
                hcs0 hcs0Var = dVar.e;
                hq6 hq6Var = dVar.d;
                if (!z || dVar.l != ((fzn) this.b)) {
                    cznVar.a();
                    break;
                } else {
                    if (dVar.o) {
                        d6z.y(null, dVar.p > 0);
                        if (System.nanoTime() - dVar.p >= dVar.f) {
                            d6z.y(null, dVar.o);
                            try {
                                hq6Var.c();
                                sgb1.g(3, "AudioSource");
                                hcs0Var.a();
                                ((AtomicBoolean) hcs0Var.w).set(false);
                                dVar.o = false;
                            } catch (AudioStream$AudioStreamException unused) {
                                sgb1.g(5, "AudioSource");
                                dVar.p = System.nanoTime();
                            }
                        }
                    }
                    if (!dVar.o) {
                        hcs0Var = hq6Var;
                    }
                    if (!cznVar.f.get()) {
                        ByteBuffer byteBuffer = cznVar.c;
                        p34 read = hcs0Var.read(byteBuffer);
                        long j = read.b;
                        int i = read.a;
                        if (i > 0) {
                            if (dVar.r) {
                                byte[] bArr = dVar.s;
                                if (bArr == null || bArr.length < i) {
                                    dVar.s = new byte[i];
                                }
                                int position = byteBuffer.position();
                                byteBuffer.put(dVar.s, 0, i);
                                byteBuffer.limit(byteBuffer.position()).position(position);
                            }
                            Executor executor = dVar.j;
                            if (executor != null && j - dVar.u >= 200) {
                                dVar.u = j;
                                o8g0 o8g0Var = dVar.k;
                                if (dVar.v == 2) {
                                    ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
                                    double d = 0.0d;
                                    while (asShortBuffer.hasRemaining()) {
                                        d = Math.max(d, Math.abs((int) asShortBuffer.get()));
                                    }
                                    dVar.t = d / 32767.0d;
                                    if (executor != null && o8g0Var != null) {
                                        executor.execute(new hc(28, dVar, o8g0Var));
                                    }
                                }
                            }
                            byteBuffer.limit(i + byteBuffer.position());
                            cznVar.b(j / 1000);
                            cznVar.c();
                        } else {
                            sgb1.g(5, "AudioSource");
                            cznVar.a();
                        }
                        dVar.c();
                        break;
                    } else {
                        ny61.r("The buffer is submitted or canceled.");
                        break;
                    }
                }
                break;
            default:
                cc8 cc8Var = (cc8) obj;
                ox90 ox90Var = (ox90) this.b;
                if (!(cc8Var instanceof zb8)) {
                    if (!cc8Var.equals(ac8.a)) {
                        if (!(cc8Var instanceof bc8)) {
                            w511.b();
                            break;
                        } else {
                            ((ryj0) this.c).onSuccess(((bc8) cc8Var).a);
                            break;
                        }
                    } else {
                        ox90Var.c();
                        break;
                    }
                } else {
                    zb8 zb8Var = (zb8) cc8Var;
                    ox90Var.a(Uri.parse(zb8Var.a), zb8Var.b);
                    break;
                }
        }
    }

    @Override // defpackage.qt5
    public void q(ByteBuffer byteBuffer, yfg yfgVar) {
        m2v m2vVar = (m2v) this.c;
        try {
            ((ee5) this.b).m(((rs10) m2vVar.c).a(byteBuffer), new ce5(0, this, yfgVar));
        } catch (RuntimeException e) {
            Log.e("BasicMessageChannel#" + ((String) m2vVar.b), "Failed to handle message", e);
            yfgVar.a(null);
        }
    }

    public int r() {
        int autoSizeMaxTextSize;
        autoSizeMaxTextSize = super/*android.widget.TextView*/.getAutoSizeMaxTextSize();
        return autoSizeMaxTextSize;
    }

    public int s() {
        int autoSizeMinTextSize;
        autoSizeMinTextSize = super/*android.widget.TextView*/.getAutoSizeMinTextSize();
        return autoSizeMinTextSize;
    }

    @Override // defpackage.xbi0
    public void setValue(Object obj, kgx kgxVar, Object obj2) {
        Object andSet = ((AtomicReference) this.c).getAndSet(obj2);
        if (andSet != null) {
            ((wls) this.b).invoke(obj, andSet);
        }
    }

    public int t() {
        int autoSizeStepGranularity;
        autoSizeStepGranularity = super/*android.widget.TextView*/.getAutoSizeStepGranularity();
        return autoSizeStepGranularity;
    }

    public int[] u() {
        int[] autoSizeTextAvailableSizes;
        autoSizeTextAvailableSizes = super/*android.widget.TextView*/.getAutoSizeTextAvailableSizes();
        return autoSizeTextAvailableSizes;
    }

    public int v() {
        int autoSizeTextType;
        autoSizeTextType = super/*android.widget.TextView*/.getAutoSizeTextType();
        return autoSizeTextType;
    }

    public TextClassifier w() {
        TextClassifier textClassifier;
        textClassifier = super/*android.widget.TextView*/.getTextClassifier();
        return textClassifier;
    }

    public void x(String str, AudioDeviceInfo audioDeviceInfo) {
        ((yeo) this.b).success(kotlin.collections.b.i(new Pair("actionType", str), new Pair("productName", audioDeviceInfo.getProductName().toString()), new Pair("deviceType", Integer.valueOf(audioDeviceInfo.getType()))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ef, code lost:
    
        if (r6 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        defpackage.sba1.i(r0, "Failed to authenticate the sector: " + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gbi0 y(List list) {
        z22 z22Var = (z22) this.b;
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new keo("nfc_read_blocks_start", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начало чтения блоков карты")));
        MifareClassic mifareClassic = (MifareClassic) this.c;
        if (mifareClassic == null) {
            return new gbi0();
        }
        try {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                Integer valueOf = Integer.valueOf(((obi0) obj).a);
                Object obj2 = linkedHashMap.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(valueOf, obj2);
                }
                ((List) obj2).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                List list2 = (List) entry.getValue();
                int blockToSector = mifareClassic.blockToSector(intValue);
                Iterator it = list2.iterator();
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    obi0 obi0Var = (obi0) it.next();
                    for (int i = 0; i < 5; i++) {
                        String str = obi0Var.c;
                        String str2 = obi0Var.d;
                        if (jl40.l(str, "A")) {
                            z = mifareClassic.authenticateSectorWithKeyA(blockToSector, jtb1.e(str2));
                        } else {
                            if (!jl40.l(str, "B")) {
                                throw new DetectedTypeReadingException(obi0Var.c);
                            }
                            z = mifareClassic.authenticateSectorWithKeyB(blockToSector, jtb1.e(str2));
                        }
                        if (z) {
                            break;
                        }
                    }
                    if (z) {
                        j73.K(mifareClassic.readBlock(obi0Var.a), "", new fd60(2), 30);
                        arrayList.add(new r400(8));
                        break;
                    }
                }
            }
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new keo("nfc_read_blocks_success", gw00.e(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Успешное чтения блоков карты"))));
            return new gbi0();
        } catch (Exception e) {
            sba1.i(z22Var, String.valueOf(e.getMessage()));
            return new gbi0();
        }
    }

    public void z(int i, int i2, int i3, int i4) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public /* synthetic */ ymu(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public ymu(wm0 wm0Var) {
        this.a = 2;
        this.b = wm0Var;
    }

    public ymu(com.yandex.div.core.expression.variables.a aVar) {
        this.a = 22;
        this.b = aVar;
        this.c = new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymu(Context context) {
        this(9, context, (Object) null);
        this.a = 9;
    }

    public ymu(String str, WebView webView, lb20 lb20Var, wls wlsVar) {
        this.a = 0;
        this.b = wlsVar;
        com.yandex.go.platform.js_api.b bVar = new com.yandex.go.platform.js_api.b(0);
        this.c = new jyp0(lb20Var, webView, bVar, str);
        uab1.a(bVar, "goplatform.app.close", new tax(8, this), new String[0]);
    }

    public /* synthetic */ ymu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public ymu(wls wlsVar) {
        this.a = 16;
        this.b = wlsVar;
        this.c = new AtomicReference();
    }

    public ymu(int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.b = Choreographer.getInstance();
                this.c = Looper.myLooper();
                break;
            case 25:
                break;
            default:
                this.b = null;
                this.c = ag1.j;
                break;
        }
    }

    public ymu(AppCompatTextView appCompatTextView) {
        this.a = 13;
        this.c = appCompatTextView;
        this.b = appCompatTextView;
    }
}
