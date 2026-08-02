package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxne;", "", "Companion", "vne", "wne", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class xne {
    public static final wne Companion = new wne();
    public static final i3y[] i = {null, null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(23)), null};
    public final String a;
    public final zzs b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final Double f;
    public final Map g;
    public final Integer h;

    public /* synthetic */ xne(int i2, String str, zzs zzsVar, Integer num, Integer num2, String str2, Double d, Map map, Integer num3) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = zzsVar;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = d;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = map;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = num3;
        }
    }

    public xne(String str, zzs zzsVar, Integer num, Integer num2, String str2, Double d, LinkedHashMap linkedHashMap, Integer num3) {
        this.a = str;
        this.b = zzsVar;
        this.c = num;
        this.d = num2;
        this.e = str2;
        this.f = d;
        this.g = linkedHashMap;
        this.h = num3;
    }

    public xne() {
        this(null, null, null, null, null, null, null, null);
    }
}
