package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.fragment.app.t;
import com.connectsdk.service.DeviceService;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.network.retrofit.NewBackendFormatError;
import com.yandex.payment.divkit.api.DivKitApi;
import com.yandex.plus.log.api.a;
import com.yandex.plus.log.api.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Response;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes4.dex */
public class xiu implements oah, ac5, w5g, pm5, os3, kip, l0c, c8k {
    public static final Class[] d = new Class[0];
    public static final Class[] e = {xiu.class};
    public static final int[] f = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final wfl g = new wfl();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public xiu(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = Choreographer.getInstance();
                this.c = Looper.myLooper();
                break;
            case 16:
                break;
            case 27:
                this.b = new ArrayList();
                this.c = new ArrayList();
                break;
            case 29:
                this.b = new rqd(null);
                this.c = new HashMap();
                break;
            default:
                hs4 hs4Var = hs4.m;
                this.c = wyf.y();
                this.b = hs4Var;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xiu b(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e2) {
                e = e2;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e3) {
            e = e3;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new xiu(17, fileChannel, fileLock);
        } catch (IOException e4) {
            e = e4;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e5) {
            e = e5;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e6) {
            e = e6;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    @Override // defpackage.os3
    public void A(Call call, Throwable th) {
        ms3 ms3Var = (ms3) this.b;
        call.getClass();
        if (th instanceof IllegalRequestOnNetworkModeException) {
            sfm sfmVar = ms3Var.e;
            d0o a = call.a();
            a.getClass();
            sfmVar.G(new nnd(y1g.f0(a, ms3Var.b), ((IllegalRequestOnNetworkModeException) th).b));
        }
        ((os3) this.c).A(ms3Var, th);
    }

    public void B(sgm sgmVar, Object obj) {
        HashMap hashMap = (HashMap) this.c;
        rqd rqdVar = (rqd) hashMap.get(sgmVar);
        if (rqdVar == null) {
            rqdVar = new rqd(sgmVar);
            rqdVar.d = rqdVar;
            rqd rqdVar2 = (rqd) this.b;
            rqdVar.d = rqdVar2.d;
            rqdVar.c = rqdVar2;
            rqdVar2.d = rqdVar;
            rqdVar.d.c = rqdVar;
            hashMap.put(sgmVar, rqdVar);
        } else {
            sgmVar.a();
        }
        if (rqdVar.b == null) {
            rqdVar.b = new ArrayList();
        }
        rqdVar.b.add(obj);
    }

    public void C() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    @Override // defpackage.os3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(Call call, Response response) {
        Object obj;
        MusicBackendResponse musicBackendResponse;
        Object obj2;
        os3 os3Var = (os3) this.c;
        call.getClass();
        ms3 ms3Var = (ms3) this.b;
        Gson gson = ms3Var.d;
        Annotation[] annotationArr = ms3Var.b;
        annotationArr.getClass();
        l3o l3oVar = response.a;
        l3o l3oVar2 = l3oVar.j;
        if (l3oVar2 == null) {
            l3oVar2 = l3oVar;
        }
        pxm f0 = y1g.f0(l3oVar2.a, annotationArr);
        o3o o3oVar = response.c;
        if (l3oVar.b()) {
            os3Var.D(ms3Var, response);
            return;
        }
        if (!ms3Var.c) {
            if (o3oVar != null) {
                try {
                    obj = gson.c(o3oVar.b(), TypeToken.get(MusicBackendResponse.class));
                } catch (Exception e2) {
                    if (!(e2 instanceof IllegalStateException) && !(e2 instanceof JsonParseException) && !(e2 instanceof NumberFormatException) && !(e2 instanceof IOException)) {
                        ssg.a(7, "runWithGsonErrorCatching", "Unexpected exception, converter don't should throw it", e2);
                        throw e2;
                    }
                    obj = null;
                }
                musicBackendResponse = (MusicBackendResponse) obj;
                sfm sfmVar = ms3Var.e;
                if (musicBackendResponse == null) {
                }
                if (musicBackendResponse != null) {
                }
                o3oVar.getClass();
                os3Var.D(ms3Var, Response.a(new m60(r9, o3oVar), l3oVar));
            }
            musicBackendResponse = null;
            sfm sfmVar2 = ms3Var.e;
            if (musicBackendResponse == null) {
            }
            if (musicBackendResponse != null) {
            }
            o3oVar.getClass();
            os3Var.D(ms3Var, Response.a(new m60(r9, o3oVar), l3oVar));
        }
        if (o3oVar != null) {
            try {
                obj2 = gson.c(o3oVar.b(), TypeToken.get(NewBackendFormatError.class));
            } catch (Exception e3) {
                if (!(e3 instanceof IllegalStateException) && !(e3 instanceof JsonParseException) && !(e3 instanceof NumberFormatException) && !(e3 instanceof IOException)) {
                    ssg.a(7, "runWithGsonErrorCatching", "Unexpected exception, converter don't should throw it", e3);
                    throw e3;
                }
                obj2 = null;
            }
            NewBackendFormatError newBackendFormatError = (NewBackendFormatError) obj2;
            if (newBackendFormatError != null) {
                musicBackendResponse = c9g.V(newBackendFormatError);
                sfm sfmVar22 = ms3Var.e;
                if (musicBackendResponse == null) {
                    sfmVar22.F(zdg.x(response, f0, musicBackendResponse));
                } else {
                    sfmVar22.F(zdg.y(response, f0));
                }
                MusicBackendInvocationError error = musicBackendResponse != null ? musicBackendResponse.getError() : null;
                o3oVar.getClass();
                os3Var.D(ms3Var, Response.a(new m60(error, o3oVar), l3oVar));
            }
        }
        musicBackendResponse = null;
        sfm sfmVar222 = ms3Var.e;
        if (musicBackendResponse == null) {
        }
        if (musicBackendResponse != null) {
        }
        o3oVar.getClass();
        os3Var.D(ms3Var, Response.a(new m60(error, o3oVar), l3oVar));
    }

    public Object E() {
        rqd rqdVar = (rqd) this.b;
        rqd rqdVar2 = rqdVar.d;
        while (true) {
            boolean equals = rqdVar2.equals(rqdVar);
            Object obj = rqdVar2.a;
            if (equals) {
                return null;
            }
            ArrayList arrayList = rqdVar2.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object remove = size > 0 ? rqdVar2.b.remove(size - 1) : null;
            if (remove != null) {
                return remove;
            }
            rqd rqdVar3 = rqdVar2.d;
            rqdVar3.c = rqdVar2.c;
            rqdVar2.c.d = rqdVar3;
            ((HashMap) this.c).remove(obj);
            ((sgm) obj).a();
            rqdVar2 = rqdVar2.d;
        }
    }

    @Override // defpackage.l0c
    public int F() {
        return ((ExtendedFloatingActionButton) this.c).y0;
    }

    public void G(Object obj, String str) {
        str.getClass();
        ((p1d) this.b).a.put(str, Long.valueOf(System.currentTimeMillis()));
        ((ConcurrentHashMap) this.c).put(str, obj);
    }

    public Drawable H(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.c) == null) {
                this.c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = H(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object I(oq oqVar, Boolean bool, cg6 cg6Var) {
        wt wtVar;
        int i;
        boolean booleanValue;
        Date date;
        String str;
        oq oqVar2 = oqVar;
        if (cg6Var instanceof wt) {
            wtVar = (wt) cg6Var;
            int i2 = wtVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wtVar.m = i2 - Integer.MIN_VALUE;
                Object obj = wtVar.k;
                nm6 nm6Var = nm6.a;
                i = wtVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                        boolean z = booleanValue;
                        String str2 = oqVar2.a;
                        String str3 = oqVar2.b;
                        String R = q7g.R(str3);
                        R.getClass();
                        int i3 = oqVar2.q;
                        tfs tfsVar = wc7.a;
                        date = oqVar2.E;
                        if (date == null) {
                            date = new Date(0L);
                        }
                        String a = wc7.a(date);
                        String I = men.I(oqVar2.o);
                        String str4 = oqVar2.i;
                        str = oqVar2.j;
                        if (str == null) {
                            str = Album$AlbumType.COMMON.a;
                        }
                        String str5 = oqVar2.k;
                        String str6 = oqVar2.e;
                        String str7 = oqVar2.f;
                        boolean z2 = oqVar2.z;
                        List list = oqVar2.y;
                        list.getClass();
                        return new ft(str2, str3, R, z, i3, a, I, str4, str, str5, str6, str7, z2, CollectionsKt.X(list, StringUtils.COMMA, null, null, new hpj(16), 30), oqVar2.l, oqVar2.g.name(), oqVar2.m, oqVar2.r, men.I(oqVar2.s), oqVar2.t, oqVar2.c, oqVar2.w, q7g.Q(oqVar2.u), oqVar2.d, oqVar2.C);
                    }
                    xnk xnkVar = (xnk) this.c;
                    String str8 = oqVar2.a;
                    wtVar.j = oqVar2;
                    wtVar.m = 1;
                    obj = ((t3g) xnkVar.a.getValue()).e(str8, wtVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oqVar2 = wtVar.j;
                    qgg.h0(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                boolean z3 = booleanValue;
                String str22 = oqVar2.a;
                String str32 = oqVar2.b;
                String R2 = q7g.R(str32);
                R2.getClass();
                int i32 = oqVar2.q;
                tfs tfsVar2 = wc7.a;
                date = oqVar2.E;
                if (date == null) {
                }
                String a2 = wc7.a(date);
                String I2 = men.I(oqVar2.o);
                String str42 = oqVar2.i;
                str = oqVar2.j;
                if (str == null) {
                }
                String str52 = oqVar2.k;
                String str62 = oqVar2.e;
                String str72 = oqVar2.f;
                boolean z22 = oqVar2.z;
                List list2 = oqVar2.y;
                list2.getClass();
                return new ft(str22, str32, R2, z3, i32, a2, I2, str42, str, str52, str62, str72, z22, CollectionsKt.X(list2, StringUtils.COMMA, null, null, new hpj(16), 30), oqVar2.l, oqVar2.g.name(), oqVar2.m, oqVar2.r, men.I(oqVar2.s), oqVar2.t, oqVar2.c, oqVar2.w, q7g.Q(oqVar2.u), oqVar2.d, oqVar2.C);
            }
        }
        wtVar = new wt(this, cg6Var);
        Object obj2 = wtVar.k;
        nm6 nm6Var2 = nm6.a;
        i = wtVar.m;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        boolean z32 = booleanValue;
        String str222 = oqVar2.a;
        String str322 = oqVar2.b;
        String R22 = q7g.R(str322);
        R22.getClass();
        int i322 = oqVar2.q;
        tfs tfsVar22 = wc7.a;
        date = oqVar2.E;
        if (date == null) {
        }
        String a22 = wc7.a(date);
        String I22 = men.I(oqVar2.o);
        String str422 = oqVar2.i;
        str = oqVar2.j;
        if (str == null) {
        }
        String str522 = oqVar2.k;
        String str622 = oqVar2.e;
        String str722 = oqVar2.f;
        boolean z222 = oqVar2.z;
        List list22 = oqVar2.y;
        list22.getClass();
        return new ft(str222, str322, R22, z32, i322, a22, I22, str422, str, str522, str622, str722, z222, CollectionsKt.X(list22, StringUtils.COMMA, null, null, new hpj(16), 30), oqVar2.l, oqVar2.g.name(), oqVar2.m, oqVar2.r, men.I(oqVar2.s), oqVar2.t, oqVar2.c, oqVar2.w, q7g.Q(oqVar2.u), oqVar2.d, oqVar2.C);
    }

    @Override // defpackage.l0c
    public int a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ((rp7) this.b).a;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.c;
        int i = extendedFloatingActionButton2.G0;
        if (i != -1) {
            return (i == 0 || i == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i;
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // defpackage.l0c
    public int c() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        rp7 rp7Var = (rp7) this.b;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.c;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return rp7Var.c();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return rp7Var.c();
    }

    @Override // defpackage.ac5
    public void d() {
        w61 w61Var = ((s71) this.b).d;
        oq oqVar = (oq) this.c;
        w61Var.getClass();
        szf.R(w61Var.b, new qvg(g0g.C(oqVar, null)), PlaybackScope.a);
    }

    @Override // defpackage.ac5
    public void e() {
        s71 s71Var = (s71) this.b;
        xzi xziVar = s71Var.i().l;
        fkn fknVar = s71Var.h;
        ki1 K = q6k.K(((v71) fknVar.a.getValue()).c().a);
        int b = ((v71) fknVar.a.getValue()).b();
        int q = q6k.q((v71) fknVar.a.getValue());
        boolean z = ((v71) fknVar.a.getValue()).c().a == s71Var.a;
        xziVar.getClass();
        osh oshVar = (osh) xziVar.a;
        oshVar.getClass();
        nmb nmbVar = (nmb) oshVar.c;
        String G = ((fnb) oshVar.b).G();
        String str = (String) oshVar.a;
        alb a = K.a();
        ykb[] ykbVarArr = ykb.a;
        nmbVar.getClass();
        str.getClass();
        G.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("artist_id", str);
        linkedHashMap.put("hash", G);
        linkedHashMap.put("page_id", "main_screen");
        linkedHashMap.put("page_type", "landing");
        linkedHashMap.put("entity_type", "artist_familiar_albums");
        eta.m(1, "entity_id", str, "entity_pos_x", linkedHashMap);
        ouj.y(1, linkedHashMap, "entity_pos_y", q, "objects_count");
        linkedHashMap.put("filter_key", "artist");
        eta.m(1, "filter_value", str, "filter_pos", linkedHashMap);
        eta.m(b + 1, "tab_id", a.a, "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z));
        linkedHashMap.put("from", "familiar_screen");
        dfi.p(1, "to", "album_screen", "_meta", linkedHashMap);
        nmbVar.C("Familiar.Albums.Navigated", linkedHashMap);
        w61 w61Var = s71Var.d;
        oq oqVar = (oq) this.c;
        w61Var.getClass();
        t tVar = w61Var.a;
        tVar.startActivity(quj.T(tVar, oqVar, null));
    }

    public void f(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((ArrayList) this.b).add(ofc.g(str, false, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 0, 91));
        ((ArrayList) this.c).add(ofc.g(str2, false, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 0, 91));
    }

    @Override // defpackage.kip
    public t9f g(String str) {
        arf arfVar = (arf) ((LinkedHashMap) this.c).get(str);
        t9f t9fVar = arfVar != null ? (t9f) arfVar.getValue() : null;
        b bVar = (b) this.b;
        if (t9fVar != null) {
            a aVar = a.c;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "DescriptorActionSerializerSelector", hrg.q("Serializer for action type = ", str, " found"));
                return t9fVar;
            }
        } else {
            a aVar2 = a.d;
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "DescriptorActionSerializerSelector", hrg.q("Serializer for action type = ", str, " not found!"));
            }
        }
        return t9fVar;
    }

    public void h(Exception exc) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new by1(this, exc, 1));
        }
    }

    @Override // defpackage.l0c
    public int i() {
        return ((ExtendedFloatingActionButton) this.c).z0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public ika j(iba ibaVar, kka kkaVar) {
        String str;
        byte[] bArr;
        ExecutorService executorService = (ExecutorService) this.c;
        ip3 ip3Var = (ip3) this.b;
        Uri uri = ibaVar.b;
        uri.getClass();
        int Q = dvt.Q(uri);
        if (Q == 0) {
            str = "application/dash+xml";
        } else if (Q == 1) {
            str = "application/vnd.ms-sstr+xml";
        } else if (Q == 2) {
            str = "application/x-mpegURL";
        } else {
            if (Q != 4) {
                xq0.q(k5r.k(uri, "Unsupported type: "));
                return null;
            }
            str = "video/x-unknown";
        }
        wmh wmhVar = new wmh();
        wmhVar.e = uri;
        wmhVar.c = str;
        wmhVar.b(ibaVar.d);
        wmhVar.d = ibaVar.f;
        byte[] bArr2 = ibaVar.e;
        bnh bnhVar = (bnh) wmhVar.g;
        if (bArr2 != null) {
            bnhVar.getClass();
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        bnhVar.h = bArr;
        onh a = wmhVar.a();
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    return new mzd(a, ip3Var, executorService);
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    return new k9r(a, ip3Var, executorService);
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    new f97();
                    int i = kkaVar.b;
                    return new y8w(a, new f0c(null, null, kkaVar.c, i != -1 ? String.valueOf(i) : null, null, null, null, false), ip3Var, executorService, dvt.Y(kkaVar.d), kkaVar.a);
                }
                break;
            case 1572033377:
                if (str.equals("video/x-unknown")) {
                    return new ovm(a, ip3Var, executorService);
                }
                break;
        }
        xq0.x("Unsupported type: ".concat(str));
        return null;
    }

    public void k(ig7 ig7Var) {
        synchronized (ig7Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new xx1(this, ig7Var, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9 A[EDGE_INSN: B:20:0x00d9->B:21:0x00d9 BREAK  A[LOOP:0: B:11:0x0066->B:18:0x0066], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(JSONObject jSONObject, cg6 cg6Var) {
        t79 t79Var;
        int i;
        twh twhVar;
        xiu xiuVar;
        o3o o3oVar;
        Iterator it;
        c7 c7Var;
        if (cg6Var instanceof t79) {
            t79Var = (t79) cg6Var;
            int i2 = t79Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t79Var.m = i2 - Integer.MIN_VALUE;
                Object obj = t79Var.k;
                nm6 nm6Var = nm6.a;
                i = t79Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    DivKitApi divKitApi = (DivKitApi) this.b;
                    String jSONObject2 = jSONObject.toString();
                    jSONObject2.getClass();
                    Pattern pattern = twh.e;
                    try {
                        twhVar = q5g.C("application/json");
                    } catch (IllegalArgumentException unused) {
                        twhVar = null;
                    }
                    g0o b = ybl.b(jSONObject2, twhVar);
                    t79Var.j = this;
                    t79Var.m = 1;
                    obj = divKitApi.a(b, t79Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    xiuVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xiuVar = t79Var.j;
                    qgg.h0(obj);
                }
                Response response = (Response) obj;
                o3oVar = (o3o) response.b;
                it = response.a.f.iterator();
                while (true) {
                    c7Var = (c7) it;
                    if (c7Var.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) c7Var.next();
                    String str = (String) pair.a;
                    String str2 = (String) pair.b;
                    if (Intrinsics.d(str, "X-Yandex-TestIds")) {
                        g0c g0cVar = (g0c) xiuVar.c;
                        str2.getClass();
                        String concat = "Текущие активные эксперименты в Template Renderer: ".concat(str2);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        r1f r1fVar = r1f.a;
                        linkedHashMap.put("test_ids", new jkr(str2));
                        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
                        vtm vtmVar = new vtm((Map) linkedHashMap);
                        ci0 ci0Var = qjb.a;
                        ci0Var.a = su4.g(1, ci0Var.a);
                        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                        qne j = su4.j(vtmVar, "event_name", "template_renderer_active_experiments", "template_renderer_active_experiments", vtmVar);
                        x60 x60Var = (x60) g0cVar;
                        x60Var.getClass();
                        x60Var.a(j);
                    }
                }
                if (o3oVar == null) {
                    return new JSONObject(o3oVar.D());
                }
                o3o o3oVar2 = response.c;
                throw new IllegalStateException(f1d.g("Body is null. ", o3oVar2 != null ? o3oVar2.D() : null));
            }
        }
        t79Var = new t79(this, cg6Var);
        Object obj2 = t79Var.k;
        nm6 nm6Var2 = nm6.a;
        i = t79Var.m;
        if (i != 0) {
        }
        Response response2 = (Response) obj2;
        o3oVar = (o3o) response2.b;
        it = response2.a.f.iterator();
        while (true) {
            c7Var = (c7) it;
            if (c7Var.hasNext()) {
            }
        }
        if (o3oVar == null) {
        }
    }

    public Object m(sgm sgmVar) {
        HashMap hashMap = (HashMap) this.c;
        rqd rqdVar = (rqd) hashMap.get(sgmVar);
        if (rqdVar == null) {
            rqdVar = new rqd(sgmVar);
            hashMap.put(sgmVar, rqdVar);
        } else {
            sgmVar.a();
        }
        rqd rqdVar2 = rqdVar.d;
        rqdVar2.c = rqdVar.c;
        rqdVar.c.d = rqdVar2;
        rqd rqdVar3 = (rqd) this.b;
        rqdVar.d = rqdVar3;
        rqd rqdVar4 = rqdVar3.c;
        rqdVar.c = rqdVar4;
        rqdVar4.d = rqdVar;
        rqdVar.d.c = rqdVar;
        ArrayList arrayList = rqdVar.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return rqdVar.b.remove(size - 1);
        }
        return null;
    }

    @Override // defpackage.oah
    public Object n(Map map, InputStream inputStream) {
        iwe iweVar = (iwe) this.b;
        String str = (String) this.c;
        w1g.w((i5f) iweVar.b).k(new rg(), new y0o((String) map.get("x-market-req-id")), new rg(), new grg(str));
        g8k m = iweVar.m(inputStream);
        if (m instanceof f8k) {
            return (oun) ((f8k) m).a;
        }
        if (m instanceof e8k) {
            return new s3o(((e8k) m).a);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.c8k
    public Object o(Uri uri, kb7 kb7Var) {
        icc iccVar = (icc) ((c8k) this.b).o(uri, kb7Var);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? iccVar : (icc) iccVar.a(list);
    }

    public Object p(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        str.getClass();
        p1d p1dVar = (p1d) this.b;
        ConcurrentHashMap concurrentHashMap2 = p1dVar.a;
        Long l = (Long) concurrentHashMap2.get(str);
        if (l != null && System.currentTimeMillis() - l.longValue() > 3600000) {
            concurrentHashMap2.remove(str);
            p1dVar.a.remove(str);
            concurrentHashMap.remove(str);
        }
        return concurrentHashMap.get(str);
    }

    public r2c q(Object... objArr) {
        Constructor d2;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    d2 = ((rj7) this.b).d();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating extension", e2);
                }
            }
            d2 = null;
        }
        if (d2 == null) {
            return null;
        }
        try {
            return (r2c) d2.newInstance(objArr);
        } catch (Exception e3) {
            b6e.o("Unexpected error creating extractor", e3);
            return null;
        }
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
        pm3 pm3Var = (pm3) this.b;
        if (exc != null) {
            pm3Var.k(exc, null);
            return;
        }
        try {
            pm3Var.k(null, (om3) this.c);
        } catch (Exception e2) {
            pm3Var.k(e2, null);
        }
    }

    @Override // defpackage.w5g
    public void s(String str) {
        le3 le3Var = (le3) this.c;
        dt1 dt1Var = (dt1) le3Var.a;
        ps1 ps1Var = (ps1) le3Var.b;
        ((pr1) ps1Var.d).b.getClass();
        if (((String) this.b) != null) {
            if (TextUtils.isEmpty(str.trim())) {
                dt1Var.c(null);
                dt1Var.s(null);
                ((u4r) ps1Var.f).m((dt1) le3Var.a, (pr1) ps1Var.d, (Uri) ps1Var.e, ps1Var.a, (m56) ps1Var.c);
                return;
            }
            return;
        }
        String trim = str.trim();
        this.b = trim;
        if (trim.matches("HTTP/1.\\d 2\\d\\d .*")) {
            return;
        }
        dt1Var.c(null);
        dt1Var.s(null);
        ((m56) ps1Var.c).g(new IOException("non 2xx status line: " + ((String) this.b)), dt1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:
    
        if (r12 != r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0060, code lost:
    
        if (r12 == r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(boolean z, cg6 cg6Var) {
        n35 n35Var;
        int i;
        rj6 rj6Var;
        cjf cjfVar = (cjf) this.b;
        if (cg6Var instanceof n35) {
            n35Var = (n35) cg6Var;
            int i2 = n35Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n35Var.m = i2 - Integer.MIN_VALUE;
                Object obj = n35Var.k;
                nm6 nm6Var = nm6.a;
                i = n35Var.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (z) {
                        n35Var.j = z;
                        n35Var.m = 1;
                        obj = cjfVar.b(true, n35Var);
                    }
                    n35Var.j = z;
                    n35Var.m = 3;
                    obj = cjfVar.a(n35Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                qgg.h0(obj);
                                return obj;
                            }
                            if (i == 5) {
                                qgg.h0(obj);
                                return obj;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = n35Var.j;
                        qgg.h0(obj);
                        cqq cqqVar = (cqq) obj;
                        if (cqqVar instanceof bqq) {
                            snq snqVar = (snq) ((bqq) cqqVar).a;
                            n35Var.j = z;
                            n35Var.m = 4;
                            Object Q = gld.Q(new rc4(this, snqVar, continuation, 13), n35Var);
                            if (Q != nm6Var) {
                                return Q;
                            }
                        } else {
                            if (!(cqqVar instanceof aqq)) {
                                b6e.s();
                                return null;
                            }
                            xh1 xh1Var = (xh1) this.c;
                            n35Var.j = z;
                            n35Var.m = 5;
                            Object Q2 = gld.Q(new er(xh1Var, null), n35Var);
                            if (Q2 != nm6Var) {
                                return Q2;
                            }
                        }
                    }
                    z = n35Var.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    snq snqVar2 = (snq) ((qj6) rj6Var).a;
                    n35Var.j = z;
                    n35Var.m = 2;
                    Object Q3 = gld.Q(new rc4(this, snqVar2, continuation, 13), n35Var);
                    return Q3 == nm6Var ? nm6Var : Q3;
                }
                if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                n35Var.j = z;
                n35Var.m = 3;
                obj = cjfVar.a(n35Var);
            }
        }
        n35Var = new n35(this, cg6Var);
        Object obj2 = n35Var.k;
        nm6 nm6Var2 = nm6.a;
        i = n35Var.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    public String toString() {
        switch (this.a) {
            case 29:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                rqd rqdVar = (rqd) this.b;
                rqd rqdVar2 = rqdVar.c;
                boolean z = false;
                while (!rqdVar2.equals(rqdVar)) {
                    sb.append('{');
                    sb.append(rqdVar2.a);
                    sb.append(':');
                    ArrayList arrayList = rqdVar2.b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    rqdVar2 = rqdVar2.c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(dsc dscVar, tg7 tg7Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new cy1(0, this, dscVar, tg7Var));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0132, code lost:
    
        if (defpackage.tyf.N(r1, r0, r9) == r8) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00fb -> B:18:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(String str, Iterable iterable, Map map, cg6 cg6Var) {
        ut utVar;
        int i;
        Iterable iterable2;
        Map map2;
        z20 z20Var;
        yq v;
        Collection arrayList;
        Iterator it;
        ut utVar2;
        Iterable iterable3;
        int i2;
        MainDatabase mainDatabase;
        Map map3;
        int i3;
        ?? r2;
        int i4;
        Boolean bool;
        if (cg6Var instanceof ut) {
            utVar = (ut) cg6Var;
            int i5 = utVar.v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                utVar.v = i5 - Integer.MIN_VALUE;
                Object obj = utVar.t;
                Object obj2 = nm6.a;
                i = utVar.v;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) this.b;
                    utVar.j = iterable;
                    utVar.k = map;
                    utVar.v = 1;
                    obj = i5hVar.b(str, utVar);
                    if (obj != obj2) {
                        iterable2 = iterable;
                        map2 = map;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Map map4 = utVar.k;
                        Iterable iterable4 = utVar.j;
                        qgg.h0(obj);
                        i4 = 3;
                        r2 = 0;
                        ssg.a(i4, r2, "insert albums", r2);
                        return Unit.a;
                    }
                    i3 = utVar.s;
                    i2 = utVar.r;
                    arrayList = utVar.q;
                    it = utVar.p;
                    Collection collection = utVar.o;
                    v = utVar.n;
                    z20Var = utVar.m;
                    MainDatabase mainDatabase2 = utVar.l;
                    Map map5 = utVar.k;
                    Iterable iterable5 = utVar.j;
                    qgg.h0(obj);
                    Iterable iterable6 = iterable5;
                    ut utVar3 = utVar;
                    mainDatabase = mainDatabase2;
                    arrayList.add((ft) obj);
                    map3 = map5;
                    utVar2 = utVar3;
                    iterable3 = iterable6;
                    arrayList = collection;
                    if (!it.hasNext()) {
                        oq oqVar = (oq) it.next();
                        if (map3 == null) {
                            bool = null;
                        } else {
                            Object obj3 = map3.get(oqVar.a);
                            if (obj3 == null) {
                                obj3 = Boolean.FALSE;
                            }
                            bool = (Boolean) obj3;
                        }
                        utVar2.j = iterable3;
                        utVar2.k = map3;
                        utVar2.l = mainDatabase;
                        utVar2.m = z20Var;
                        utVar2.n = v;
                        Collection collection2 = arrayList;
                        utVar2.o = collection2;
                        utVar2.p = it;
                        utVar2.q = collection2;
                        utVar2.r = i2;
                        utVar2.s = i3;
                        utVar2.v = 2;
                        Object I = I(oqVar, bool, utVar2);
                        if (I != obj2) {
                            ut utVar4 = utVar2;
                            map5 = map3;
                            obj = I;
                            iterable6 = iterable3;
                            utVar3 = utVar4;
                            collection = arrayList;
                            arrayList.add((ft) obj);
                            map3 = map5;
                            utVar2 = utVar3;
                            iterable3 = iterable6;
                            arrayList = collection;
                            if (!it.hasNext()) {
                                vt vtVar = new vt(mainDatabase, null, z20Var, (List) arrayList, iterable3, v, this);
                                r2 = 0;
                                utVar2.j = null;
                                utVar2.k = null;
                                utVar2.l = null;
                                utVar2.m = null;
                                utVar2.n = null;
                                utVar2.o = null;
                                utVar2.p = null;
                                utVar2.q = null;
                                utVar2.r = 0;
                                i4 = 3;
                                utVar2.v = 3;
                            }
                        }
                    }
                    return obj2;
                }
                map2 = utVar.k;
                iterable2 = utVar.j;
                qgg.h0(obj);
                MainDatabase mainDatabase3 = (MainDatabase) obj;
                z20 y = mainDatabase3.y();
                z20Var = y;
                v = mainDatabase3.v();
                arrayList = new ArrayList(v75.o(iterable2, 10));
                it = iterable2.iterator();
                utVar2 = utVar;
                iterable3 = iterable2;
                i2 = 0;
                mainDatabase = mainDatabase3;
                map3 = map2;
                i3 = 0;
                if (!it.hasNext()) {
                }
                return obj2;
            }
        }
        utVar = new ut(this, cg6Var);
        Object obj4 = utVar.t;
        Object obj22 = nm6.a;
        i = utVar.v;
        if (i != 0) {
        }
        MainDatabase mainDatabase32 = (MainDatabase) obj4;
        z20 y2 = mainDatabase32.y();
        z20Var = y2;
        v = mainDatabase32.v();
        arrayList = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        utVar2 = utVar;
        iterable3 = iterable2;
        i2 = 0;
        mainDatabase = mainDatabase32;
        map3 = map2;
        i3 = 0;
        if (!it.hasNext()) {
        }
        return obj22;
    }

    @Override // defpackage.l0c
    public ViewGroup.LayoutParams w() {
        int i = ((ExtendedFloatingActionButton) this.c).G0;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }

    public bfu x(Object obj, String str, lm4 lm4Var, lm4 lm4Var2) {
        Class b = lm4Var2.b();
        b.getClass();
        String o = ouj.o(str, StringUtils.PROCESS_POSTFIX_DELIMITER, b.getCanonicalName());
        jfu jfuVar = (jfu) this.b;
        Class b2 = lm4Var.b();
        b2.getClass();
        ci6 ci6Var = new ci6(this, b2, obj);
        gs6 gs6Var = gs6.b;
        jfuVar.getClass();
        gs6Var.getClass();
        return new bjt(jfuVar, ci6Var, gs6Var).j(ern.a(b), o);
    }

    public void y(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
        lum W = lum.W(absSeekBar.getContext(), attributeSet, f, i);
        Drawable N = W.N(0);
        if (N != null) {
            if (N instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) N;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable H = H(animationDrawable.getFrame(i2), true);
                    H.setLevel(10000);
                    animationDrawable2.addFrame(H, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                N = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(N);
        }
        Drawable N2 = W.N(1);
        if (N2 != null) {
            absSeekBar.setProgressDrawable(H(N2, false));
        }
        W.f0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(cg6 cg6Var, wpq wpqVar, boolean z) {
        o35 o35Var;
        int i;
        List list;
        if (cg6Var instanceof o35) {
            o35Var = (o35) cg6Var;
            int i2 = o35Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o35Var.l = i2 - Integer.MIN_VALUE;
                Object obj = o35Var.j;
                Object obj2 = nm6.a;
                i = o35Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    int ordinal = wpqVar.ordinal();
                    if (ordinal == 0) {
                        o35Var.l = 1;
                        obj = t(z, o35Var);
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        xh1 xh1Var = (xh1) this.c;
                        o35Var.l = 2;
                        obj = gld.Q(new wwd(xh1Var, null, 1), o35Var);
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    list = (List) obj;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    list = (List) obj;
                }
                return new qj6(list);
            }
        }
        o35Var = new o35(this, cg6Var);
        Object obj3 = o35Var.j;
        Object obj22 = nm6.a;
        i = o35Var.l;
        if (i != 0) {
        }
        return new qj6(list);
    }

    public xiu(le3 le3Var, iwe iweVar, q2a q2aVar, pg pgVar, String str) {
        this.a = 3;
        this.b = iweVar;
        this.c = str;
    }

    public /* synthetic */ xiu(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public xiu(p1d p1dVar) {
        this.a = 18;
        this.b = p1dVar;
        this.c = new ConcurrentHashMap();
    }

    public xiu(Context context) {
        this.a = 15;
        context.getClass();
        this.b = context;
        this.c = btf.b(new k5(26, this));
    }

    public xiu(DivKitApi divKitApi, g0c g0cVar) {
        this.a = 22;
        divKitApi.getClass();
        g0cVar.getClass();
        this.b = divKitApi;
        this.c = g0cVar;
    }

    public xiu(ArrayList arrayList, b bVar) {
        this.a = 21;
        bVar.getClass();
        this.b = bVar;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jip jipVar = ((bh) it.next()).a;
            if (jipVar != null) {
                arrayList2.add(jipVar);
            }
        }
        int a = tah.a(v75.o(arrayList2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            jip jipVar2 = (jip) it2.next();
            linkedHashMap.put(jipVar2.a, btf.b(jipVar2.b));
        }
        this.c = linkedHashMap;
    }

    public xiu(cq4 cq4Var, e65 e65Var) {
        this.a = 14;
        this.b = e65Var;
        rar rarVar = (rar) this.c;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.c = ox6.B(new eno(new z21(2, 12, continuation)), cq4Var, new i64(18, this));
    }

    public xiu(Context context, z66 z66Var) {
        this.a = 9;
        context.getClass();
        this.b = context;
        this.c = z66Var;
    }

    public xiu(Charset charset, qxp qxpVar) {
        this.a = 20;
        charset.getClass();
        this.b = charset;
        this.c = qxpVar;
    }

    public xiu(jfu jfuVar) {
        this.a = 0;
        jfuVar.getClass();
        this.b = jfuVar;
        this.c = new a6p(16, this);
    }

    public xiu(AbsSeekBar absSeekBar) {
        this.a = 1;
        this.b = absSeekBar;
    }

    public /* synthetic */ xiu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public xiu(le3 le3Var) {
        this.a = 7;
        this.c = le3Var;
    }

    public xiu(Handler handler, fy1 fy1Var) {
        this.a = 8;
        if (fy1Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = fy1Var;
    }

    public xiu(EditText editText) {
        this.a = 23;
        this.b = editText;
        j4b j4bVar = new j4b(editText);
        this.c = j4bVar;
        editText.addTextChangedListener(j4bVar);
        if (v3b.b == null) {
            synchronized (v3b.a) {
                try {
                    if (v3b.b == null) {
                        v3b v3bVar = new v3b();
                        try {
                            v3b.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, v3b.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        v3b.b = v3bVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(v3b.b);
    }

    public xiu(rj7 rj7Var) {
        this.a = 19;
        this.b = rj7Var;
        this.c = new AtomicBoolean(false);
    }
}
