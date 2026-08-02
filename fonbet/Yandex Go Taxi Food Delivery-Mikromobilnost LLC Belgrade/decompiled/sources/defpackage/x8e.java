package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Base64;
import android.util.JsonReader;
import com.google.common.collect.ImmutableList;
import com.google.gson.internal.LinkedTreeMap;
import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1InvalidChoiceOptionException;
import com.objsys.asn1j.runtime.Asn1Tag;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes11.dex */
public final /* synthetic */ class x8e implements fp60, tji0, vls, suy, ury0, k920, uf41, rdj, r131 {
    public final /* synthetic */ int a;

    public /* synthetic */ x8e(int i) {
        this.a = i;
    }

    public static /* synthetic */ void b() {
        throw new Asn1InvalidChoiceOptionException();
    }

    public static /* synthetic */ void d(Asn1BerDecodeBuffer asn1BerDecodeBuffer, Asn1Tag asn1Tag) {
        throw new Asn1InvalidChoiceOptionException(asn1BerDecodeBuffer, asn1Tag);
    }

    public Constructor a() {
        switch (this.a) {
            case 18:
                int[] iArr = lbh.f;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(b5p.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                int[] iArr2 = lbh.f;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(b5p.class).getConstructor(null);
        }
    }

    @Override // defpackage.vls, defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        int i = 3;
        switch (this.a) {
            case 11:
                Bundle bundle = (Bundle) obj;
                String str = odf.r;
                ndf ndfVar = new ndf();
                CharSequence charSequence = bundle.getCharSequence(odf.r);
                if (charSequence != null) {
                    ndfVar.a = charSequence;
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(odf.s);
                    if (parcelableArrayList != null) {
                        SpannableString valueOf = SpannableString.valueOf(charSequence);
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            Bundle bundle2 = (Bundle) it.next();
                            int i2 = bundle2.getInt(blf.a);
                            int i3 = bundle2.getInt(blf.b);
                            int i4 = bundle2.getInt(blf.c);
                            int i5 = bundle2.getInt(blf.d, -1);
                            Bundle bundle3 = bundle2.getBundle(blf.e);
                            if (i5 == 1) {
                                bundle3.getClass();
                                String string = bundle3.getString(sjl0.c);
                                string.getClass();
                                valueOf.setSpan(new sjl0(string, bundle3.getInt(sjl0.d)), i2, i3, i4);
                            } else if (i5 == 2) {
                                bundle3.getClass();
                                valueOf.setSpan(new fmy0(bundle3.getInt(fmy0.d), bundle3.getInt(fmy0.e), bundle3.getInt(fmy0.f)), i2, i3, i4);
                            } else if (i5 == i) {
                                valueOf.setSpan(new rru(), i2, i3, i4);
                            } else if (i5 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(lz31.b);
                                string2.getClass();
                                valueOf.setSpan(new lz31(string2), i2, i3, i4);
                            }
                            i = 3;
                        }
                        ndfVar.a = valueOf;
                    }
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(odf.t);
                if (alignment != null) {
                    ndfVar.c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(odf.u);
                if (alignment2 != null) {
                    ndfVar.d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable(odf.v);
                if (bitmap != null) {
                    ndfVar.b = bitmap;
                } else {
                    byte[] byteArray = bundle.getByteArray(odf.w);
                    if (byteArray != null) {
                        ndfVar.b = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    }
                }
                String str2 = odf.x;
                if (bundle.containsKey(str2)) {
                    String str3 = odf.y;
                    if (bundle.containsKey(str3)) {
                        float f = bundle.getFloat(str2);
                        int i6 = bundle.getInt(str3);
                        ndfVar.e = f;
                        ndfVar.f = i6;
                    }
                }
                String str4 = odf.z;
                if (bundle.containsKey(str4)) {
                    ndfVar.g = bundle.getInt(str4);
                }
                String str5 = odf.A;
                if (bundle.containsKey(str5)) {
                    ndfVar.h = bundle.getFloat(str5);
                }
                String str6 = odf.B;
                if (bundle.containsKey(str6)) {
                    ndfVar.i = bundle.getInt(str6);
                }
                String str7 = odf.D;
                if (bundle.containsKey(str7)) {
                    String str8 = odf.C;
                    if (bundle.containsKey(str8)) {
                        float f2 = bundle.getFloat(str7);
                        int i7 = bundle.getInt(str8);
                        ndfVar.k = f2;
                        ndfVar.j = i7;
                    }
                }
                String str9 = odf.E;
                if (bundle.containsKey(str9)) {
                    ndfVar.l = bundle.getFloat(str9);
                }
                String str10 = odf.F;
                if (bundle.containsKey(str10)) {
                    ndfVar.m = bundle.getFloat(str10);
                }
                String str11 = odf.G;
                if (bundle.containsKey(str11)) {
                    ndfVar.o = bundle.getInt(str11);
                    ndfVar.n = true;
                }
                if (!bundle.getBoolean(odf.H, false)) {
                    ndfVar.n = false;
                }
                String str12 = odf.I;
                if (bundle.containsKey(str12)) {
                    ndfVar.p = bundle.getInt(str12);
                }
                String str13 = odf.J;
                if (bundle.containsKey(str13)) {
                    ndfVar.q = bundle.getFloat(str13);
                }
                return ndfVar.a();
            case 12:
                odf odfVar = (odf) obj;
                Bitmap bitmap2 = odfVar.d;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence2 = odfVar.a;
                if (charSequence2 != null) {
                    bundle4.putCharSequence(odf.r, charSequence2);
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str14 = blf.a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (sjl0 sjl0Var : (sjl0[]) spanned.getSpans(0, spanned.length(), sjl0.class)) {
                            sjl0Var.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(sjl0.c, sjl0Var.a);
                            bundle5.putInt(sjl0.d, sjl0Var.b);
                            arrayList.add(blf.a(spanned, sjl0Var, 1, bundle5));
                        }
                        for (fmy0 fmy0Var : (fmy0[]) spanned.getSpans(0, spanned.length(), fmy0.class)) {
                            fmy0Var.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(fmy0.d, fmy0Var.a);
                            bundle6.putInt(fmy0.e, fmy0Var.b);
                            bundle6.putInt(fmy0.f, fmy0Var.c);
                            arrayList.add(blf.a(spanned, fmy0Var, 2, bundle6));
                        }
                        for (rru rruVar : (rru[]) spanned.getSpans(0, spanned.length(), rru.class)) {
                            arrayList.add(blf.a(spanned, rruVar, 3, null));
                        }
                        for (lz31 lz31Var : (lz31[]) spanned.getSpans(0, spanned.length(), lz31.class)) {
                            lz31Var.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(lz31.b, lz31Var.a);
                            arrayList.add(blf.a(spanned, lz31Var, 4, bundle7));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(odf.s, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(odf.t, odfVar.b);
                bundle4.putSerializable(odf.u, odfVar.c);
                bundle4.putFloat(odf.x, odfVar.e);
                bundle4.putInt(odf.y, odfVar.f);
                bundle4.putInt(odf.z, odfVar.g);
                bundle4.putFloat(odf.A, odfVar.h);
                bundle4.putInt(odf.B, odfVar.i);
                bundle4.putInt(odf.C, odfVar.n);
                bundle4.putFloat(odf.D, odfVar.o);
                bundle4.putFloat(odf.E, odfVar.j);
                bundle4.putFloat(odf.F, odfVar.k);
                bundle4.putBoolean(odf.H, odfVar.l);
                bundle4.putInt(odf.G, odfVar.m);
                bundle4.putInt(odf.I, odfVar.p);
                bundle4.putFloat(odf.J, odfVar.q);
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    d6z.x(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(odf.w, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            case 13:
                long j = ((tdf) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            default:
                return ImmutableList.r(Integer.valueOf(((tsb) obj).a));
        }
    }

    @Override // defpackage.tji0
    public int c(int i, int i2) {
        return (i - i2) - 1;
    }

    @Override // defpackage.suy
    public void e(Object obj, hfr hfrVar) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Object f(JsonReader jsonReader) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        switch (this.a) {
            case 4:
                vit vitVar = e3f.a;
                d44 d44Var = new d44();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -609862170:
                            if (nextName.equals("libraryName")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case 3002454:
                            if (nextName.equals("arch")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 230943785:
                            if (nextName.equals("buildId")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        case false:
                            d44Var.d(jsonReader.nextString());
                            break;
                        case true:
                            d44Var.b(jsonReader.nextString());
                            break;
                        case true:
                            d44Var.c(jsonReader.nextString());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                break;
            case 5:
                vit vitVar2 = e3f.a;
                j44 j44Var = new j44();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (!nextName2.equals("filename")) {
                        if (nextName2.equals("contents")) {
                            byte[] decode = Base64.decode(jsonReader.nextString(), 2);
                            if (decode == null) {
                                ny61.t("Null contents");
                                break;
                            } else {
                                j44Var.b = decode;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        String nextString = jsonReader.nextString();
                        if (nextString != null) {
                            j44Var.a = nextString;
                        } else {
                            ny61.t("Null filename");
                        }
                    }
                }
                jsonReader.endObject();
                break;
            case 6:
                vit vitVar3 = e3f.a;
                o54 o54Var = new o54();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    switch (nextName3.hashCode()) {
                        case -1536268810:
                            if (nextName3.equals("parameterKey")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1027290370:
                            if (nextName3.equals("templateVersion")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 1098747284:
                            if (nextName3.equals("rolloutVariant")) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 1124454216:
                            if (nextName3.equals("parameterValue")) {
                                z2 = 3;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                            o54Var.b(jsonReader.nextString());
                            break;
                        case true:
                            o54Var.d(jsonReader.nextLong());
                            break;
                        case true:
                            q54 q54Var = new q54();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName4 = jsonReader.nextName();
                                nextName4.getClass();
                                if (nextName4.equals("variantId")) {
                                    q54Var.c(jsonReader.nextString());
                                } else if (nextName4.equals("rolloutId")) {
                                    q54Var.b(jsonReader.nextString());
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            o54Var.a = q54Var.a();
                            break;
                        case true:
                            o54Var.c(jsonReader.nextString());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                break;
            case 7:
                vit vitVar4 = e3f.a;
                e54 e54Var = new e54();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName5 = jsonReader.nextName();
                    nextName5.getClass();
                    switch (nextName5.hashCode()) {
                        case -1266514778:
                            if (nextName5.equals("frames")) {
                                z3 = false;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 3373707:
                            if (nextName5.equals("name")) {
                                z3 = true;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 2125650548:
                            if (nextName5.equals("importance")) {
                                z3 = 2;
                                break;
                            }
                            z3 = -1;
                            break;
                        default:
                            z3 = -1;
                            break;
                    }
                    switch (z3) {
                        case false:
                            e54Var.b(e3f.d(jsonReader, new x8e(9)));
                            break;
                        case true:
                            e54Var.d(jsonReader.nextString());
                            break;
                        case true:
                            e54Var.c(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                break;
            case 8:
                vit vitVar5 = e3f.a;
                y44 y44Var = new y44();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName6 = jsonReader.nextName();
                    nextName6.getClass();
                    switch (nextName6.hashCode()) {
                        case 3373707:
                            if (nextName6.equals("name")) {
                                z4 = false;
                                break;
                            }
                            z4 = -1;
                            break;
                        case 3530753:
                            if (nextName6.equals("size")) {
                                z4 = true;
                                break;
                            }
                            z4 = -1;
                            break;
                        case 3601339:
                            if (nextName6.equals("uuid")) {
                                z4 = 2;
                                break;
                            }
                            z4 = -1;
                            break;
                        case 1153765347:
                            if (nextName6.equals("baseAddress")) {
                                z4 = 3;
                                break;
                            }
                            z4 = -1;
                            break;
                        default:
                            z4 = -1;
                            break;
                    }
                    switch (z4) {
                        case false:
                            y44Var.c(jsonReader.nextString());
                            break;
                        case true:
                            y44Var.d(jsonReader.nextLong());
                            break;
                        case true:
                            y44Var.d = new String(Base64.decode(jsonReader.nextString(), 2), c3f.a);
                            break;
                        case true:
                            y44Var.b(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                break;
        }
        return e3f.a(jsonReader);
    }

    @Override // defpackage.fp60
    public Object i() {
        switch (this.a) {
            case 0:
                return new LinkedTreeMap();
            case 1:
                return new LinkedHashMap();
            default:
                return new TreeMap();
        }
    }

    @Override // defpackage.rdj
    public void k(AlertDialog alertDialog) {
    }

    @Override // defpackage.r131
    public boolean l(Object obj) {
        Long l = (Long) obj;
        switch (this.a) {
            case 26:
                if (l.longValue() >= 0) {
                    break;
                }
                break;
            case 27:
                if (l.longValue() >= 0) {
                    break;
                }
                break;
            case 28:
                if (l.longValue() >= 0) {
                    break;
                }
                break;
            default:
                if (l.longValue() >= 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.uf41
    public void onClose() {
    }

    @Override // defpackage.ury0
    public void onCues(rdf rdfVar) {
    }

    @Override // defpackage.k920
    public void onMetadata(w820 w820Var) {
    }
}
