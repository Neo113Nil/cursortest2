package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import com.google.android.gms.cloudmessaging.d;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.firebase.components.DependencyException;
import com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.div.core.c;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.state.db.StateEntry;
import com.yandex.mob.api.model.MobEnvironment;
import com.yandex.mob.domain.g;
import com.yandex.mob.okhttp.metrics.MobCallStatus;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.layers.domain.model.BubbleType;

/* loaded from: classes.dex */
public final class yuf0 implements a1d {
    public static final wa60 g = new wa60(0.14f, 0.86f, 0.21f, 0.51f);
    public static final wa60 h = new wa60(0.11f, 0.89f, 0.33f, 0.44f);
    public static final wa60 i = new wa60(0.39f, 0.61f, 0.19f, 0.52f);
    public static final wa60 j = new wa60(0.41f, 0.42f, 0.27f, 0.43f);
    public static final wa60 k = new wa60(0.58f, 0.59f, 0.27f, 0.43f);
    public static final wa60 l = new wa60(0.29f, 0.67f, 0.22f, 0.47f);
    public static final wa60 m = new wa60(0.36f, 0.37f, 0.31f, 0.39f);
    public static final wa60 n = new wa60(0.63f, 0.64f, 0.31f, 0.39f);
    public static final wa60 o = new wa60(0.23f, 0.67f, 0.0f, 0.75f);
    public static final wa60 p = new wa60(0.3f, 0.31f, 0.27f, 0.28f);
    public static final wa60 q = new wa60(0.69f, 0.7f, 0.27f, 0.28f);
    public static final wa60 r = new wa60(0.42f, 0.585f, 0.19f, 0.54f);
    public static final wa60 s = new wa60(0.49f, 0.51f, 0.34f, 0.36f);
    public Object a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public yuf0(int i2) {
        switch (i2) {
            case 17:
                this.a = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                break;
            default:
                this.a = new int[]{t4h0.abc_textfield_search_default_mtrl_alpha, t4h0.abc_textfield_default_mtrl_alpha, t4h0.abc_ab_share_pack_mtrl_alpha};
                this.b = new int[]{t4h0.abc_ic_commit_search_api_mtrl_alpha, t4h0.abc_seekbar_tick_mark_material, t4h0.abc_ic_menu_share_mtrl_alpha, t4h0.abc_ic_menu_copy_mtrl_am_alpha, t4h0.abc_ic_menu_cut_mtrl_alpha, t4h0.abc_ic_menu_selectall_mtrl_alpha, t4h0.abc_ic_menu_paste_mtrl_am_alpha};
                this.c = new int[]{t4h0.abc_textfield_activated_mtrl_alpha, t4h0.abc_textfield_search_activated_mtrl_alpha, t4h0.abc_cab_background_top_mtrl_alpha, t4h0.abc_text_cursor_material, t4h0.abc_text_select_handle_left_mtrl, t4h0.abc_text_select_handle_middle_mtrl, t4h0.abc_text_select_handle_right_mtrl};
                this.d = new int[]{t4h0.abc_popup_background_mtrl_mult, t4h0.abc_cab_background_internal_bg, t4h0.abc_menu_hardkey_panel_mtrl_mult};
                this.e = new int[]{t4h0.abc_tab_indicator_material, t4h0.abc_textfield_search_material};
                this.f = new int[]{t4h0.abc_btn_check_material, t4h0.abc_btn_radio_material, t4h0.abc_btn_check_material_anim, t4h0.abc_btn_radio_material_anim};
                break;
        }
    }

    public static void F(gm20 gm20Var, IOException iOException) {
        gm20Var.c.put("error_domain", iOException.getClass().getSimpleName());
        ConcurrentHashMap concurrentHashMap = gm20Var.c;
        String message = iOException.getMessage();
        if (message == null) {
            message = "";
        }
        concurrentHashMap.put("error_description", message);
    }

    public static void N(Drawable drawable, int i2, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = or2.b;
        }
        mutate.setColorFilter(or2.c(i2, mode));
    }

    public static f9h h(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < readInt; i2++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                ny61.v(oyr.i(readInt2, "Invalid value size: "));
                return null;
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = tw21.c;
            int i3 = 0;
            while (i3 != readInt2) {
                int i4 = i3 + min;
                bArr = Arrays.copyOf(bArr, i4);
                dataInputStream.readFully(bArr, i3, min);
                min = Math.min(readInt2 - i4, 10485760);
                i3 = i4;
            }
            hashMap.put(readUTF, bArr);
        }
        return new f9h(hashMap);
    }

    public static void i(f9h f9hVar, DataOutputStream dataOutputStream) {
        Set<Map.Entry> c = f9hVar.c();
        dataOutputStream.writeInt(c.size());
        for (Map.Entry entry : c) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static boolean l(int i2, int[] iArr) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static yuf0 p(String str, ByteString byteString, KeyData$KeyMaterialType keyData$KeyMaterialType, OutputPrefixType outputPrefixType, Integer num) {
        if (outputPrefixType == OutputPrefixType.RAW) {
            if (num != null) {
                kbs.v("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            kbs.v("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new yuf0(str, byteString, keyData$KeyMaterialType, outputPrefixType, num);
    }

    public static ColorStateList q(int i2, Context context) {
        int c = vwy0.c(iog0.colorControlHighlight, context);
        int b = vwy0.b(iog0.colorButtonNormal, context);
        int[] iArr = vwy0.b;
        int[] iArr2 = vwy0.d;
        int d = lhc.d(c, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, vwy0.c, vwy0.f}, new int[]{b, d, lhc.d(c, i2), i2});
    }

    public static LayerDrawable z(kuj0 kuj0Var, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable d = kuj0Var.d(t4h0.abc_star_black_48dp, context);
        Drawable d2 = kuj0Var.d(t4h0.abc_star_half_black_48dp, context);
        if ((d instanceof BitmapDrawable) && d.getIntrinsicWidth() == dimensionPixelSize && d.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) d;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            d.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((d2 instanceof BitmapDrawable) && d2.getIntrinsicWidth() == dimensionPixelSize && d2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) d2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            d2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public yva0 A(long j2, q4u0 q4u0Var) {
        synchronized (((ArrayList) this.f)) {
            if (((ArrayList) this.f).isEmpty()) {
                return new yva0(j2, q4u0Var);
            }
            yva0 yva0Var = (yva0) ((ArrayList) this.f).remove(0);
            yva0Var.e(j2);
            yva0Var.f(-1L);
            yva0Var.d(q4u0Var);
            return yva0Var;
        }
    }

    public ColorStateList B(int i2, Context context) {
        if (i2 == t4h0.abc_edit_text_material) {
            return qke.m(drg0.abc_tint_edittext, context);
        }
        if (i2 == t4h0.abc_switch_track_mtrl_alpha) {
            return qke.m(drg0.abc_tint_switch_track, context);
        }
        if (i2 != t4h0.abc_switch_thumb_material) {
            if (i2 == t4h0.abc_btn_default_mtrl_shape) {
                return q(vwy0.c(iog0.colorButtonNormal, context), context);
            }
            if (i2 == t4h0.abc_btn_borderless_material) {
                return q(0, context);
            }
            if (i2 == t4h0.abc_btn_colored_material) {
                return q(vwy0.c(iog0.colorAccent, context), context);
            }
            if (i2 == t4h0.abc_spinner_mtrl_am_alpha || i2 == t4h0.abc_spinner_textfield_background_material) {
                return qke.m(drg0.abc_tint_spinner, context);
            }
            if (l(i2, (int[]) this.b)) {
                return vwy0.d(iog0.colorControlNormal, context);
            }
            if (l(i2, (int[]) this.e)) {
                return qke.m(drg0.abc_tint_default, context);
            }
            if (l(i2, (int[]) this.f)) {
                return qke.m(drg0.abc_tint_btn_checkable, context);
            }
            if (i2 == t4h0.abc_seekbar_thumb_material) {
                return qke.m(drg0.abc_tint_seek_thumb, context);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = vwy0.d(iog0.colorSwitchThumbNormal, context);
        if (d == null || !d.isStateful()) {
            iArr[0] = vwy0.b;
            iArr2[0] = vwy0.b(iog0.colorSwitchThumbNormal, context);
            iArr[1] = vwy0.e;
            iArr2[1] = vwy0.c(iog0.colorControlActivated, context);
            iArr[2] = vwy0.f;
            iArr2[2] = vwy0.c(iog0.colorSwitchThumbNormal, context);
        } else {
            int[] iArr3 = vwy0.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = vwy0.e;
            iArr2[1] = vwy0.c(iog0.colorControlActivated, context);
            iArr[2] = vwy0.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void C(ArrayList arrayList, c231 c231Var) {
        List J0 = a.J0(arrayList);
        ((LinkedHashMap) this.c).put(c231Var.c(), J0);
        ((LinkedHashMap) this.d).put(J0, c231Var);
        ((ArrayList) this.e).add(c231Var);
        ((LinkedHashSet) this.f).remove(c231Var.c());
    }

    public void D(c231 c231Var) {
        ((com.yandex.div.core.expression.variables.a) this.a).i(c231Var);
        ((LinkedHashSet) this.f).remove(c231Var.c());
    }

    public void E(long j2) {
        ed7 ed7Var;
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap hashMap = (HashMap) this.a;
        ed7 ed7Var2 = (ed7) this.e;
        ed7Var2.b(j2);
        ed7 ed7Var3 = (ed7) this.f;
        if (ed7Var3 != null) {
            ed7Var3.b(j2);
        }
        if (ed7Var2.j() || (ed7Var = (ed7) this.f) == null || !ed7Var.j()) {
            ed7Var2.o(hashMap, sparseArray);
        } else {
            ((ed7) this.f).o(hashMap, sparseArray);
            ed7Var2.d(hashMap);
        }
        ed7 ed7Var4 = (ed7) this.f;
        if (ed7Var4 != null) {
            ed7Var4.delete();
            this.f = null;
        }
    }

    public void G(String str) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        HashMap hashMap = (HashMap) this.a;
        dd7 dd7Var = (dd7) hashMap.get(str);
        if (dd7Var != null && dd7Var.g() && dd7Var.i()) {
            hashMap.remove(str);
            int i2 = dd7Var.a;
            boolean z = sparseBooleanArray.get(i2);
            ((ed7) this.e).l(dd7Var, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i2);
                sparseBooleanArray.delete(i2);
            } else {
                sparseArray.put(i2, null);
                ((SparseBooleanArray) this.c).put(i2, true);
            }
        }
    }

    public void H(Div2View div2View) {
        List<com.yandex.div.core.expression.triggers.a> list;
        if (jl40.l((Div2View) this.e, div2View)) {
            return;
        }
        this.e = div2View;
        List list2 = (List) this.f;
        if (list2 == null || (list = (List) ((LinkedHashMap) this.d).get(list2)) == null) {
            return;
        }
        for (com.yandex.div.core.expression.triggers.a aVar : list) {
            aVar.n.add(div2View);
            aVar.b();
        }
    }

    public void I(String str) {
        synchronized (((ArrayList) this.b)) {
            long nanoTime = System.nanoTime();
            ArrayList arrayList = (ArrayList) this.b;
            synchronized (arrayList) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    yva0 yva0Var = (yva0) arrayList.get(i2);
                    if (jl40.l(yva0Var.a().a(), str) && yva0Var.c() < 0) {
                        yva0Var.f(nanoTime);
                    }
                }
            }
            ((ArrayList) this.b).add(A(nanoTime, new q4u0(str)));
        }
    }

    public void J(gm20 gm20Var) {
        ConcurrentHashMap concurrentHashMap = gm20Var.c;
        Object obj = concurrentHashMap.get(ClidProvider.TIMESTAMP);
        Long l2 = obj instanceof Long ? (Long) obj : null;
        if (l2 != null) {
            concurrentHashMap.put("total_duration", Long.valueOf(((npt) this.c).a() - l2.longValue()));
        }
    }

    public void K(String str, MapBuilder mapBuilder) {
        MapBuilder mapBuilder2 = new MapBuilder();
        mapBuilder2.putAll((Map) ((AtomicReference) this.f).updateAndGet(new saj(3, this)));
        mapBuilder2.putAll(mapBuilder);
        mapBuilder2.put(ClidProvider.TIMESTAMP, Long.valueOf(((npt) this.c).a()));
        ((rot) this.a).b(new Pair(str, mapBuilder2.j()));
    }

    public void L(yva0 yva0Var) {
        synchronized (((ArrayList) this.f)) {
            try {
                ((ArrayList) this.f).add(yva0Var);
            } catch (OutOfMemoryError unused) {
                ((ArrayList) this.f).clear();
                ((ArrayList) this.f).add(yva0Var);
            }
        }
    }

    public void M(String str, String str2, Bundle bundle) {
        int i2;
        String str3;
        String str4;
        boolean e;
        HeartBeatInfo$HeartBeat heartBeatInfo$HeartBeat;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        com.google.firebase.a aVar = (com.google.firebase.a) this.a;
        aVar.a();
        bundle.putString("gmp_app_id", aVar.c.b);
        u820 u820Var = (u820) this.b;
        synchronized (u820Var) {
            try {
                if (u820Var.d == 0) {
                    try {
                        packageInfo = u820Var.a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e2) {
                        e2.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        u820Var.d = packageInfo.versionCode;
                    }
                }
                i2 = u820Var.d;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i2));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((u820) this.b).a());
        u820 u820Var2 = (u820) this.b;
        synchronized (u820Var2) {
            try {
                if (u820Var2.c == null) {
                    u820Var2.d();
                }
                str3 = u820Var2.c;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        com.google.firebase.a aVar2 = (com.google.firebase.a) this.a;
        aVar2.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(aVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String a = ((f3w) udq0.f(((com.google.firebase.installations.a) ((hcr) this.f)).d())).a();
            if (!TextUtils.isEmpty(a)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a);
            }
        } catch (InterruptedException | ExecutionException e3) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e3);
        }
        bundle.putString("appid", (String) udq0.f(((com.google.firebase.installations.a) ((hcr) this.f)).c()));
        bundle.putString("cliv", "fcm-25.0.1");
        ueu ueuVar = (ueu) ((zvf0) this.e).get();
        gnh gnhVar = (gnh) ((zvf0) this.d).get();
        if (ueuVar == null || gnhVar == null) {
            return;
        }
        ich ichVar = (ich) ueuVar;
        synchronized (ichVar) {
            long currentTimeMillis = System.currentTimeMillis();
            xeu xeuVar = (xeu) ichVar.a.get();
            synchronized (xeuVar) {
                e = xeuVar.e(currentTimeMillis);
            }
            if (e) {
                synchronized (xeuVar) {
                    xeuVar.a.a(new sxo(29, xeuVar, xeuVar.b(System.currentTimeMillis())));
                }
                heartBeatInfo$HeartBeat = HeartBeatInfo$HeartBeat.GLOBAL;
            } else {
                heartBeatInfo$HeartBeat = HeartBeatInfo$HeartBeat.NONE;
            }
        }
        if (heartBeatInfo$HeartBeat != HeartBeatInfo$HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatInfo$HeartBeat.a()));
            bundle.putString("Firebase-Client", gnhVar.a());
        }
    }

    public Task O(String str, String str2, Bundle bundle) {
        try {
            M(str, str2, bundle);
            com.google.android.gms.cloudmessaging.a aVar = (com.google.android.gms.cloudmessaging.a) this.c;
            ykj ykjVar = ykj.w;
            hif hifVar = aVar.c;
            return hifVar.j() < 12000000 ? hifVar.k() != 0 ? aVar.a(bundle).i(ykjVar, new gr81(13, aVar, bundle)) : udq0.o(new IOException("MISSING_INSTANCEID_SERVICE")) : d.a(aVar.b).c(1, bundle).h(ykjVar, omy0.w);
        } catch (InterruptedException | ExecutionException e) {
            return udq0.o(e);
        }
    }

    public void P() {
        ((ed7) this.e).k((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i2));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public Drawable Q(int i2, String str) {
        kdc b;
        Drawable t = vng.t(i2, ((avj0) ((zuj0) this.c)).a);
        if (str != null && (b = ((ufu) ((pdc) this.b)).b(str)) != null) {
            t.setColorFilter(new PorterDuffColorFilter(Integer.valueOf(s8o.m(b, (Context) this.a)).intValue(), PorterDuff.Mode.SRC_IN));
        }
        return t;
    }

    @Override // defpackage.a1d
    public Object a(Class cls) {
        if (!((Set) this.a).contains(jgg0.a(cls))) {
            throw new DependencyException(qv10.m(cls, "Attempting to request an undeclared dependency ", Extension.DOT_CHAR));
        }
        Object a = ((a1d) this.f).a(cls);
        if (!cls.equals(xyf0.class)) {
            return a;
        }
        return new jxj0();
    }

    @Override // defpackage.a1d
    public zvf0 b(jgg0 jgg0Var) {
        if (((Set) this.e).contains(jgg0Var)) {
            return ((a1d) this.f).b(jgg0Var);
        }
        yci0.w("Attempting to request an undeclared dependency Provider<Set<", jgg0Var, ">>.");
        return null;
    }

    @Override // defpackage.a1d
    public Object c(jgg0 jgg0Var) {
        if (((Set) this.a).contains(jgg0Var)) {
            return ((a1d) this.f).c(jgg0Var);
        }
        yci0.w("Attempting to request an undeclared dependency ", jgg0Var, Extension.DOT_CHAR);
        return null;
    }

    @Override // defpackage.a1d
    public zvf0 d(Class cls) {
        return f(jgg0.a(cls));
    }

    @Override // defpackage.a1d
    public cg70 e(jgg0 jgg0Var) {
        if (((Set) this.c).contains(jgg0Var)) {
            return ((a1d) this.f).e(jgg0Var);
        }
        yci0.w("Attempting to request an undeclared dependency Deferred<", jgg0Var, ">.");
        return null;
    }

    @Override // defpackage.a1d
    public zvf0 f(jgg0 jgg0Var) {
        if (((Set) this.b).contains(jgg0Var)) {
            return ((a1d) this.f).f(jgg0Var);
        }
        yci0.w("Attempting to request an undeclared dependency Provider<", jgg0Var, ">.");
        return null;
    }

    @Override // defpackage.a1d
    public Set g(jgg0 jgg0Var) {
        if (((Set) this.d).contains(jgg0Var)) {
            return ((a1d) this.f).g(jgg0Var);
        }
        yci0.w("Attempting to request an undeclared dependency Set<", jgg0Var, ">.");
        return null;
    }

    public void j(long j2, long j3, List list, ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) this.e;
        ArrayList arrayList3 = (ArrayList) this.d;
        ArrayList arrayList4 = (ArrayList) this.c;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                yva0 yva0Var = (yva0) arrayList.get(size);
                if (yva0Var.c() > 0 && yva0Var.c() < j2) {
                    L((yva0) arrayList.remove(size));
                } else if (yva0Var.b() < j3) {
                    arrayList4.add(yva0Var);
                    if (arrayList.equals((ArrayList) this.b) && yva0Var.c() == -1) {
                        yva0Var.f(j2);
                    }
                }
                if (i2 < 0) {
                    break;
                } else {
                    size = i2;
                }
            }
        }
        if (arrayList4.size() > 0) {
            int size2 = arrayList4.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (arrayList2.contains(Integer.valueOf(i3))) {
                    arrayList3.add(Integer.valueOf(i3));
                } else {
                    yva0 yva0Var2 = (yva0) arrayList4.get(i3);
                    int i4 = i3 + 1;
                    int size3 = arrayList4.size();
                    while (true) {
                        if (i4 < size3) {
                            yva0 yva0Var3 = (yva0) arrayList4.get(i4);
                            if (jl40.l(yva0Var2.a().a(), yva0Var3.a().a())) {
                                if (yva0Var2.b() < yva0Var3.b()) {
                                    arrayList3.add(Integer.valueOf(i3));
                                    break;
                                }
                                arrayList2.add(Integer.valueOf(i4));
                            }
                            i4++;
                        }
                    }
                }
            }
            for (int size4 = arrayList3.size() - 1; -1 < size4; size4--) {
                arrayList4.remove(((Number) arrayList3.get(size4)).intValue());
            }
            int size5 = arrayList4.size();
            for (int i5 = 0; i5 < size5; i5++) {
                list.add(((yva0) arrayList4.get(i5)).a());
            }
            arrayList4.clear();
            arrayList3.clear();
            arrayList2.clear();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x00ae. Please report as an issue. */
    public void k(yf7 yf7Var, MobCallStatus mobCallStatus, tls tlsVar) {
        fm20 fm20Var;
        ConcurrentHashMap concurrentHashMap;
        npt nptVar = (npt) this.c;
        long a = nptVar.a();
        fm20 fm20Var2 = new fm20(yf7Var);
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.d;
        Pair pair = new Pair(fm20Var2, (gm20) concurrentHashMap2.get(fm20Var2));
        fm20 fm20Var3 = (fm20) pair.getFirst();
        gm20 gm20Var = (gm20) pair.getSecond();
        if (gm20Var == null && mobCallStatus == MobCallStatus.Enqueue) {
            ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
            concurrentHashMap3.put("request_path", yf7Var.k().a.b());
            concurrentHashMap3.put(ClidProvider.TIMESTAMP, Long.valueOf(nptVar.a()));
            concurrentHashMap3.put("local_id", UUID.randomUUID().toString());
            concurrentHashMap2.put(fm20Var3, new gm20(mobCallStatus, a, concurrentHashMap3));
            return;
        }
        if (gm20Var != null) {
            MobCallStatus mobCallStatus2 = gm20Var.a;
            ConcurrentHashMap concurrentHashMap4 = gm20Var.c;
            if (mobCallStatus2 == mobCallStatus) {
                return;
            }
            tlsVar.invoke(gm20Var);
            long j2 = a - gm20Var.b;
            switch (fr20.a[mobCallStatus.ordinal()]) {
                case 1:
                    fm20Var = fm20Var3;
                    concurrentHashMap = concurrentHashMap2;
                    if (mobCallStatus2 == MobCallStatus.Enqueue) {
                        concurrentHashMap4.put("local_queue_time", Long.valueOf(j2));
                    }
                    concurrentHashMap.put(fm20Var, new gm20(mobCallStatus, a, concurrentHashMap4));
                    break;
                case 2:
                    fm20Var = fm20Var3;
                    concurrentHashMap = concurrentHashMap2;
                    MapBuilder mapBuilder = new MapBuilder();
                    mapBuilder.put("duration", Long.valueOf(j2));
                    bb1.G(mapBuilder, "url", concurrentHashMap4.get("proxy_url"));
                    bb1.G(mapBuilder, "type", concurrentHashMap4.get("proxy_type"));
                    K("Network.Proxy", mapBuilder.j());
                    concurrentHashMap.put(fm20Var, new gm20(mobCallStatus, a, concurrentHashMap4));
                    break;
                case 3:
                    fm20Var = fm20Var3;
                    concurrentHashMap = concurrentHashMap2;
                    if (mobCallStatus2 == MobCallStatus.Enqueue) {
                        concurrentHashMap4.put("local_queue_time", Long.valueOf(j2));
                    }
                    concurrentHashMap.put(fm20Var, new gm20(mobCallStatus, a, concurrentHashMap4));
                    break;
                case 4:
                    fm20Var = fm20Var3;
                    concurrentHashMap = concurrentHashMap2;
                    MapBuilder mapBuilder2 = new MapBuilder();
                    mapBuilder2.put("duration", Long.valueOf(j2));
                    bb1.G(mapBuilder2, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, concurrentHashMap4.get("dns_domain"));
                    bb1.G(mapBuilder2, "ip", concurrentHashMap4.get("dns_ip"));
                    K("Network.DNS", mapBuilder2.j());
                    concurrentHashMap.put(fm20Var, new gm20(mobCallStatus, a, concurrentHashMap4));
                    break;
                case 5:
                    fm20Var = fm20Var3;
                    concurrentHashMap = concurrentHashMap2;
                    if (mobCallStatus2 == MobCallStatus.Enqueue) {
                        concurrentHashMap4.put("local_queue_time", Long.valueOf(j2));
                    }
                    concurrentHashMap.put(fm20Var, new gm20(mobCallStatus, a, concurrentHashMap4));
                    break;
                case 6:
                    fm20Var = fm20Var3;
                    concurrentHashMap = concurrentHashMap2;
                    MapBuilder mapBuilder3 = new MapBuilder();
                    mapBuilder3.put("duration", Long.valueOf(j2));
                    bb1.G(mapBuilder3, "ip", concurrentHashMap4.get("connection_ip"));
                    K("Network.Connect.Success", mapBuilder3.j());
                    concurrentHashMap.put(fm20Var, new gm20(mobCallStatus, a, concurrentHashMap4));
                    break;
                case 7:
                    MapBuilder mapBuilder4 = new MapBuilder();
                    bb1.G(mapBuilder4, "errorDomain", concurrentHashMap4.get("error_domain"));
                    bb1.G(mapBuilder4, "errorDescription", concurrentHashMap4.get("error_description"));
                    K("Network.Connect.Failure", mapBuilder4.j());
                    concurrentHashMap = concurrentHashMap2;
                    concurrentHashMap.remove(fm20Var3);
                    break;
                case 8:
                    if (mobCallStatus2 == MobCallStatus.Enqueue) {
                        concurrentHashMap4.put("local_queue_time", Long.valueOf(j2));
                    }
                    MapBuilder mapBuilder5 = new MapBuilder();
                    bb1.G(mapBuilder5, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, concurrentHashMap4.get("request_host"));
                    bb1.G(mapBuilder5, StateEntry.COLUMN_PATH, concurrentHashMap4.get("request_path"));
                    bb1.G(mapBuilder5, "kind", concurrentHashMap4.get("request_kind"));
                    bb1.G(mapBuilder5, "localId", concurrentHashMap4.get("local_id"));
                    K("Network.Request", mapBuilder5.j());
                    fm20Var = fm20Var3;
                    concurrentHashMap = concurrentHashMap2;
                    concurrentHashMap.put(fm20Var, new gm20(mobCallStatus, a, concurrentHashMap4));
                    break;
                case 9:
                    concurrentHashMap4.put("request_duration", Long.valueOf(j2));
                    fm20Var = fm20Var3;
                    concurrentHashMap = concurrentHashMap2;
                    concurrentHashMap.put(fm20Var, new gm20(mobCallStatus, a, concurrentHashMap4));
                    break;
                case 10:
                    Object obj = concurrentHashMap4.get("request_duration");
                    Long l2 = obj instanceof Long ? (Long) obj : null;
                    concurrentHashMap4.put("request_duration", Long.valueOf((l2 != null ? l2.longValue() : 0L) + j2));
                    J(gm20Var);
                    if (concurrentHashMap4.get("error_domain") != null) {
                        K("Network.Failure", bb1.c(gm20Var));
                    } else {
                        J(gm20Var);
                        K("Network.Success", bb1.d(gm20Var));
                    }
                    concurrentHashMap = concurrentHashMap2;
                    concurrentHashMap.remove(fm20Var3);
                    break;
                case 11:
                    J(gm20Var);
                    K("Network.Failure", bb1.c(gm20Var));
                    concurrentHashMap = concurrentHashMap2;
                    concurrentHashMap.remove(fm20Var3);
                    break;
                case 12:
                    J(gm20Var);
                    MapBuilder mapBuilder6 = new MapBuilder();
                    bb1.G(mapBuilder6, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, concurrentHashMap4.get("request_host"));
                    bb1.G(mapBuilder6, StateEntry.COLUMN_PATH, concurrentHashMap4.get("request_path"));
                    bb1.G(mapBuilder6, "kind", concurrentHashMap4.get("request_kind"));
                    bb1.G(mapBuilder6, "localQueueDuration", concurrentHashMap4.get("local_queue_time"));
                    bb1.G(mapBuilder6, "localId", concurrentHashMap4.get("local_id"));
                    bb1.G(mapBuilder6, "retryNumber", concurrentHashMap4.get("retry_number"));
                    bb1.G(mapBuilder6, "totalDuration", concurrentHashMap4.get("total_duration"));
                    K("Network.Cancelled", mapBuilder6.j());
                    concurrentHashMap = concurrentHashMap2;
                    concurrentHashMap.remove(fm20Var3);
                    break;
                default:
                    fm20Var = fm20Var3;
                    concurrentHashMap = concurrentHashMap2;
                    concurrentHashMap.put(fm20Var, new gm20(mobCallStatus, a, concurrentHashMap4));
                    break;
            }
            long a2 = nptVar.a();
            AtomicLong atomicLong = (AtomicLong) this.e;
            if (a2 - atomicLong.get() > 10000) {
                concurrentHashMap.entrySet().removeIf(new md3(7, new er20(nptVar.a() - 30000, this)));
                atomicLong.set(a2);
            }
        }
    }

    public void m(Div2View div2View) {
        this.e = null;
        Iterator it = ((LinkedHashMap) this.d).entrySet().iterator();
        while (it.hasNext()) {
            for (com.yandex.div.core.expression.triggers.a aVar : (List) ((Map.Entry) it.next()).getValue()) {
                ym11.a(aVar.n).remove(div2View);
                aVar.b();
            }
        }
    }

    public void n() {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Object remove = ((LinkedHashMap) this.c).remove((String) it.next());
            if (remove == null) {
                ny61.g("Path should be indexed while update");
                return;
            }
            Object remove2 = ((LinkedHashMap) this.d).remove((List) remove);
            if (remove2 == null) {
                ny61.g("Variable should be indexed while update");
                return;
            }
            ((c231) remove2).f((tls) this.b);
        }
        com.yandex.div.core.expression.variables.a aVar = (com.yandex.div.core.expression.variables.a) this.a;
        String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
        aVar.k((String[]) Arrays.copyOf(strArr, strArr.length));
        linkedHashSet.clear();
    }

    public void o() {
        com.yandex.div.core.expression.variables.a aVar = (com.yandex.div.core.expression.variables.a) this.a;
        ArrayList arrayList = (ArrayList) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c231 c231Var = (c231) it.next();
            if (aVar.h(c231Var.c())) {
                aVar.i(c231Var);
            } else {
                aVar.f(c231Var);
            }
            c231 g2 = aVar.g(c231Var.c());
            if (g2 == null) {
                ny61.g("Required value was null.");
                return;
            }
            g2.a((tls) this.b);
        }
        arrayList.clear();
    }

    public fn6 r(dxu0 dxu0Var, List list, qn6 qn6Var, Drawable drawable, BubbleType bubbleType, tls tlsVar) {
        Canvas canvas = (Canvas) this.f;
        Context context = (Context) this.a;
        int i2 = 0;
        int i3 = 1;
        fn6 b = ibb1.b(canvas, context, qn6Var != null);
        b.p((ru.yandex.taxi.design.utils.a) this.d, new hgr0(0.0f, tje.w(8, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowBottom)));
        b.l(drawable);
        int i4 = in6.a[bubbleType.ordinal()];
        int i5 = 3;
        if (i4 != 1) {
            int i6 = 2;
            if (i4 == 2) {
                b.j(Q(azg0.ic_bubble_small, dxu0Var != null ? dxu0Var.getA() : null));
                b.n(new hn6(this, i2));
            } else if (i4 == 3) {
                b.j(Q(azg0.ic_bubble_medium, dxu0Var != null ? dxu0Var.getA() : null));
                b.n(new hn6(this, i3));
            } else {
                if (i4 != 4) {
                    w511.b();
                    return null;
                }
                b.j(Q(azg0.ic_bubble_medium_or_large_corner_16, dxu0Var != null ? dxu0Var.getA() : null));
                b.n(new hn6(this, i6));
            }
        }
        if (qn6Var != null) {
            b.q(qn6Var.c());
            int i7 = azg0.ic_bubble_overlay;
            pn6 a = qn6Var.a();
            b.k(Q(i7, a != null ? a.getA() : null));
            b.o(new hn6(this, i5));
            b.m((Drawable) tlsVar.invoke(qn6Var.b()));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b.a((View) it.next());
        }
        return b.d();
    }

    public void s(List list) {
        tvo tvoVar = (tvo) this.a;
        l6o l6oVar = (l6o) this.b;
        if (((List) this.f) == list) {
            return;
        }
        this.f = list;
        Div2View div2View = (Div2View) this.e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        Object obj = linkedHashMap.get(list);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(list, obj);
        }
        List list2 = (List) obj;
        if (div2View != null) {
            m(div2View);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lll lllVar = (lll) it.next();
            Expression expression = lllVar.b;
            com.yandex.div.json.expressions.a aVar = expression instanceof com.yandex.div.json.expressions.a ? (com.yandex.div.json.expressions.a) expression : null;
            if (aVar == null) {
                l6oVar.e(new IllegalStateException("Invalid condition: '" + expression + '\'', new RuntimeException("Condition is not mutable!")));
            } else {
                RuntimeException runtimeException = aVar.g(tvoVar).isEmpty() ? new RuntimeException("No variables defined!") : null;
                if (runtimeException != null) {
                    l6oVar.e(new IllegalStateException("Invalid condition: '" + expression + '\'', runtimeException));
                } else {
                    list2.add(new com.yandex.div.core.expression.triggers.a(aVar, lllVar.a, lllVar.c, tvoVar, l6oVar, (c) this.c));
                }
            }
        }
        if (div2View != null) {
            H(div2View);
        }
    }

    public Task t(Task task) {
        return task.h(new b43(1), new kbs(this));
    }

    public void u() {
        if (!((ArrayList) this.e).isEmpty()) {
            ny61.g("Pending variables is not consumed");
        } else {
            if (((LinkedHashSet) this.f).isEmpty()) {
                return;
            }
            ny61.g("Missing variables is not consumed");
        }
    }

    public dd7 v(String str) {
        return (dd7) ((HashMap) this.a).get(str);
    }

    public cg70 w(Class cls) {
        return e(jgg0.a(cls));
    }

    public void x(long j2, long j3, ArrayList arrayList) {
        synchronized (((ArrayList) this.b)) {
            arrayList.clear();
            j(j2, j3, arrayList, (ArrayList) this.a);
            j(j2, j3, arrayList, (ArrayList) this.b);
        }
    }

    public dd7 y(String str) {
        HashMap hashMap = (HashMap) this.a;
        dd7 dd7Var = (dd7) hashMap.get(str);
        if (dd7Var != null) {
            return dd7Var;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i2 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i2 < size && i2 == sparseArray.keyAt(i2)) {
                i2++;
            }
            keyAt = i2;
        }
        dd7 dd7Var2 = new dd7(keyAt, str);
        hashMap.put(str, dd7Var2);
        sparseArray.put(keyAt, str);
        ((SparseBooleanArray) this.d).put(keyAt, true);
        ((ed7) this.e).i(dd7Var2);
        return dd7Var2;
    }

    public yuf0(zuj0 zuj0Var, h3y h3yVar) {
        this.a = zuj0Var;
        this.b = h3yVar;
        final int i2 = 0;
        this.c = kotlin.a.a(new sls(this) { // from class: pxh
            public final /* synthetic */ yuf0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                yuf0 yuf0Var = this.b;
                switch (i3) {
                    case 0:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_care_map_scheme);
                    case 1:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_care_map_host);
                    case 2:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_test_care_map_host);
                    default:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_care_map_path_prefix);
                }
            }
        });
        final int i3 = 1;
        this.d = kotlin.a.a(new sls(this) { // from class: pxh
            public final /* synthetic */ yuf0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i3;
                yuf0 yuf0Var = this.b;
                switch (i32) {
                    case 0:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_care_map_scheme);
                    case 1:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_care_map_host);
                    case 2:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_test_care_map_host);
                    default:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_care_map_path_prefix);
                }
            }
        });
        final int i4 = 2;
        this.e = kotlin.a.a(new sls(this) { // from class: pxh
            public final /* synthetic */ yuf0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i4;
                yuf0 yuf0Var = this.b;
                switch (i32) {
                    case 0:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_care_map_scheme);
                    case 1:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_care_map_host);
                    case 2:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_test_care_map_host);
                    default:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_care_map_path_prefix);
                }
            }
        });
        final int i5 = 3;
        this.f = kotlin.a.a(new sls(this) { // from class: pxh
            public final /* synthetic */ yuf0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i5;
                yuf0 yuf0Var = this.b;
                switch (i32) {
                    case 0:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_care_map_scheme);
                    case 1:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_care_map_host);
                    case 2:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_test_care_map_host);
                    default:
                        return ((avj0) ((zuj0) yuf0Var.a)).h(ozh0.delivery_care_map_path_prefix);
                }
            }
        });
    }

    public yuf0(tvo tvoVar, l6o l6oVar, c cVar) {
        this.a = tvoVar;
        this.b = l6oVar;
        this.c = cVar;
        this.d = new LinkedHashMap();
    }

    public yuf0(MobEnvironment mobEnvironment, yn20 yn20Var, g gVar, jse jseVar, jr20 jr20Var, duu duuVar, al20 al20Var, al20 al20Var2, al20 al20Var3, al20 al20Var4, al20 al20Var5) {
        this.a = mobEnvironment;
        this.b = yn20Var;
        this.c = jr20Var;
        this.d = duuVar;
        this.e = al20Var4;
        this.f = al20Var5;
    }

    public yuf0(Context context, pdc pdcVar, zuj0 zuj0Var, ru.yandex.taxi.design.utils.a aVar, kjz kjzVar) {
        this.a = context;
        this.b = pdcVar;
        this.c = zuj0Var;
        this.d = aVar;
        this.e = kjzVar;
        this.f = new Canvas();
    }

    public yuf0(rot rotVar, cb2 cb2Var, npt nptVar) {
        this.a = rotVar;
        this.b = cb2Var;
        this.c = nptVar;
        this.d = new ConcurrentHashMap();
        this.e = new AtomicLong(nptVar.a());
        this.f = new AtomicReference(null);
    }

    public yuf0(j0d j0dVar, a1d a1dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<vwi> set = j0dVar.c;
        Set set2 = j0dVar.g;
        for (vwi vwiVar : set) {
            int i2 = vwiVar.c;
            int i3 = vwiVar.b;
            boolean z = i2 == 0;
            jgg0 jgg0Var = vwiVar.a;
            if (z) {
                if (i3 == 2) {
                    hashSet4.add(jgg0Var);
                } else {
                    hashSet.add(jgg0Var);
                }
            } else if (i2 == 2) {
                hashSet3.add(jgg0Var);
            } else if (i3 == 2) {
                hashSet5.add(jgg0Var);
            } else {
                hashSet2.add(jgg0Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(jgg0.a(xyf0.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = a1dVar;
    }

    public yuf0(String str, ByteString byteString, KeyData$KeyMaterialType keyData$KeyMaterialType, OutputPrefixType outputPrefixType, Integer num) {
        this.a = str;
        this.b = rw21.b(str);
        this.c = byteString;
        this.d = keyData$KeyMaterialType;
        this.e = outputPrefixType;
        this.f = num;
    }

    public /* synthetic */ yuf0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public yuf0(lqg lqgVar, File file, boolean z) {
        d6z.x((lqgVar == null && file == null) ? false : true);
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        cxq0 cxq0Var = lqgVar != null ? new cxq0(lqgVar) : null;
        q66 q66Var = file != null ? new q66(new File(file, "cached_content_index.exi")) : null;
        if (cxq0Var != null && (q66Var == null || !z)) {
            this.e = cxq0Var;
            this.f = q66Var;
        } else {
            int i2 = tw21.a;
            this.e = q66Var;
            this.f = cxq0Var;
        }
    }

    public yuf0(com.google.firebase.a aVar, u820 u820Var, zvf0 zvf0Var, zvf0 zvf0Var2, hcr hcrVar) {
        aVar.a();
        com.google.android.gms.cloudmessaging.a aVar2 = new com.google.android.gms.cloudmessaging.a(aVar.a);
        this.a = aVar;
        this.b = u820Var;
        this.c = aVar2;
        this.d = zvf0Var;
        this.e = zvf0Var2;
        this.f = hcrVar;
    }

    public yuf0(com.yandex.div.core.expression.variables.a aVar, tls tlsVar) {
        this.a = aVar;
        this.b = tlsVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new ArrayList();
        this.f = new LinkedHashSet();
    }

    public yuf0(mtx0 mtx0Var) {
        this.b = mtx0Var;
        this.d = cuu.a;
        this.e = o2g0.a;
        this.f = ypr.a;
    }
}
