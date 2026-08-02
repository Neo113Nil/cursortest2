package defpackage;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wc {

    @NotNull
    public static final vc Companion = new vc();

    @NotNull
    public static final wc NON_AUTHORISED = new wc("", "", "", null, true, b6d.b, false, false, false, c5b.a);
    private final String email;

    @NotNull
    private final String fullName;

    @NotNull
    private final b6d geoRegion;
    private final boolean hasMusicSubscription;

    @NotNull
    private final List<String> hasOptions;
    private final boolean hasPlus;
    private final boolean isKidsUser;
    private final boolean isServiceAvailable;

    @NotNull
    private final String login;

    @NotNull
    private final String uid;

    public wc(String str, String str2, String str3, String str4, boolean z, b6d b6dVar, boolean z2, boolean z3, boolean z4, List list) {
        b6dVar.getClass();
        list.getClass();
        this.uid = str;
        this.login = str2;
        this.fullName = str3;
        this.email = str4;
        this.isServiceAvailable = z;
        this.geoRegion = b6dVar;
        this.hasPlus = z2;
        this.hasMusicSubscription = z3;
        this.isKidsUser = z4;
        this.hasOptions = list;
    }

    public final String a() {
        return this.email;
    }

    public final String b() {
        return this.fullName;
    }

    public final b6d c() {
        return this.geoRegion;
    }

    public final boolean d() {
        return this.hasMusicSubscription;
    }

    public final List e() {
        return this.hasOptions;
    }

    public final boolean f() {
        return this.hasPlus;
    }

    public final String g() {
        return this.login;
    }

    public final String h() {
        return this.uid;
    }

    public final boolean i() {
        return this.isKidsUser;
    }

    public final boolean j() {
        return this.isServiceAvailable;
    }
}
