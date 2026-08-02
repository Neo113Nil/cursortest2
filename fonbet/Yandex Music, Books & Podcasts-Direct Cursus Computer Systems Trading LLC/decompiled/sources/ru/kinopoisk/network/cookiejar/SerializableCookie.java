package ru.kinopoisk.network.cookiejar;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ek6;
import defpackage.whp;
import defpackage.xq0;
import defpackage.xv;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0015\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005¨\u0006\u0015"}, d2 = {"Lru/kinopoisk/network/cookiejar/SerializableCookie;", "Ljava/io/Serializable;", "Lek6;", "cookie", "<init>", "(Lek6;)V", "Ljava/io/ObjectInputStream;", "ois", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Ljava/io/ObjectOutputStream;", "oos", "writeObject", "(Ljava/io/ObjectOutputStream;)V", "Lek6;", "getCookie", "()Lek6;", "setCookie", "Companion", "whp", "libs_android_network_cookiejar"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class SerializableCookie implements Serializable {

    @NotNull
    public static final whp Companion = new whp();

    @NotNull
    private static final String LEGACY_FQCN = "com.franmontiel.persistentcookiejar.persistence.SerializableCookie";
    private static final long NON_VALID_EXPIRES_AT = -1;
    private static final long serialVersionUID = -46889586195906960L;
    private transient ek6 cookie;

    public /* synthetic */ SerializableCookie(ek6 ek6Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ek6Var);
    }

    private final void readObject(ObjectInputStream ois) {
        boolean z;
        Object readObject = ois.readObject();
        readObject.getClass();
        String str = (String) readObject;
        if (!Intrinsics.d(StringsKt.t0(str).toString(), str)) {
            xq0.x("name is not trimmed");
            return;
        }
        Object readObject2 = ois.readObject();
        readObject2.getClass();
        String str2 = (String) readObject2;
        if (!Intrinsics.d(StringsKt.t0(str2).toString(), str2)) {
            xq0.x("value is not trimmed");
            return;
        }
        long readLong = ois.readLong();
        boolean z2 = true;
        if (readLong != NON_VALID_EXPIRES_AT) {
            if (readLong <= 0) {
                readLong = Long.MIN_VALUE;
            }
            r7 = readLong <= 253402300799999L ? readLong : 253402300799999L;
            z = true;
        } else {
            z = false;
        }
        Object readObject3 = ois.readObject();
        readObject3.getClass();
        String str3 = (String) readObject3;
        String T = xv.T(str3);
        if (T == null) {
            xq0.x("unexpected domain: ".concat(str3));
            return;
        }
        Object readObject4 = ois.readObject();
        readObject4.getClass();
        String str4 = (String) readObject4;
        if (!c.v(str4, "/", false)) {
            xq0.x("path must start with '/'");
            return;
        }
        long j = r7;
        boolean readBoolean = ois.readBoolean();
        boolean readBoolean2 = ois.readBoolean();
        if (ois.readBoolean()) {
            T = xv.T(str3);
            if (T == null) {
                xq0.x("unexpected domain: ".concat(str3));
                return;
            }
        } else {
            z2 = false;
        }
        this.cookie = new ek6(str, str2, j, T, str4, readBoolean, readBoolean2, z, z2);
    }

    private final void writeObject(ObjectOutputStream oos) {
        ek6 ek6Var = this.cookie;
        if (ek6Var == null) {
            xq0.x("Required value was null.");
            return;
        }
        oos.writeObject(ek6Var.a);
        oos.writeObject(ek6Var.b);
        oos.writeLong(ek6Var.h ? ek6Var.c : NON_VALID_EXPIRES_AT);
        oos.writeObject(ek6Var.d);
        oos.writeObject(ek6Var.e);
        oos.writeBoolean(ek6Var.f);
        oos.writeBoolean(ek6Var.g);
        oos.writeBoolean(ek6Var.i);
    }

    public final ek6 getCookie() {
        return this.cookie;
    }

    public final void setCookie(ek6 ek6Var) {
        this.cookie = ek6Var;
    }

    private SerializableCookie(ek6 ek6Var) {
        this.cookie = ek6Var;
    }

    public /* synthetic */ SerializableCookie(ek6 ek6Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(ek6Var);
    }
}
