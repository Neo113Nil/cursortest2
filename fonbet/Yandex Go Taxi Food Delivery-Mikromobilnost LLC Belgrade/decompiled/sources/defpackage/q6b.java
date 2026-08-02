package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.isolated.IsolatedChatConfig;
import com.yandex.messaging.ui.timeline.ChatOpenTarget;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class q6b extends s120 {
    public final g720 a;
    public final ChatRequest b;
    public final String c;
    public final String d;
    public final ServerMessageRef e;
    public final LocalMessageRef f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public boolean j;
    public final ChatOpenTarget k;
    public final boolean l;
    public final List m;
    public final m5g0 n;
    public final hqr0 o;
    public final String p;
    public final String q;
    public boolean r;
    public final IsolatedChatConfig s;
    public final boolean t;
    public final String u;
    public final String v;
    public final boolean w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q6b(Bundle bundle) {
        this(r27, r28, r7, r8, r1, r38, r39, r40, r20, r6, r1, r1, r32, r33, r19, r1, r1, r1, (IsolatedChatConfig) r3, bundle.getBoolean("Messaging.Arguments.PersonalInviteLink"), bundle.getString("Messaging.Arguments.Action"));
        Class cls;
        g720 g720Var;
        Object u;
        ChatRequest chatRequest;
        Object u2;
        LocalMessageRef localMessageRef;
        boolean z;
        boolean z2;
        String str;
        Object u3;
        Object obj;
        Object obj2;
        String string = bundle.getString("Messaging.Arguments.Source");
        if (string == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
            throw null;
        }
        int i = g720.c;
        g720 b = glb1.b(string);
        Parcelable parcelable = (Parcelable) vng.u(bundle, ChatRequest.class, "Messaging.Arguments.ChatRequest");
        if (parcelable == null) {
            ny61.r("missing required key Messaging.Arguments.ChatRequest");
            throw null;
        }
        ChatRequest chatRequest2 = (ChatRequest) parcelable;
        String string2 = bundle.getString("Messaging.Arguments.Text");
        String string3 = bundle.getString("Messaging.Arguments.Payload");
        boolean containsKey = bundle.containsKey("Messaging.Arguments.MessageRef");
        Class cls2 = Character.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Short.TYPE;
        Class cls8 = Byte.TYPE;
        Class cls9 = Boolean.TYPE;
        if (containsKey) {
            g0c a = qoi0.a(ServerMessageRef.class);
            cls = cls9;
            if (a.equals(qoi0.a(cls))) {
                u = (ServerMessageRef) Boolean.valueOf(bundle.getBoolean("Messaging.Arguments.MessageRef", true));
            } else if (a.equals(qoi0.a(cls8))) {
                u = (ServerMessageRef) bundle.getByte("Messaging.Arguments.MessageRef", (byte) 0);
            } else if (a.equals(qoi0.a(byte[].class))) {
                u = (ServerMessageRef) bundle.getByteArray("Messaging.Arguments.MessageRef");
            } else if (a.equals(qoi0.a(cls7))) {
                u = (ServerMessageRef) Short.valueOf(bundle.getShort("Messaging.Arguments.MessageRef"));
            } else if (a.equals(qoi0.a(cls6))) {
                u = (ServerMessageRef) Integer.valueOf(bundle.getInt("Messaging.Arguments.MessageRef", 0));
            } else if (a.equals(qoi0.a(int[].class))) {
                u = (ServerMessageRef) bundle.getIntArray("Messaging.Arguments.MessageRef");
            } else if (a.equals(qoi0.a(cls5))) {
                g720Var = b;
                u = (ServerMessageRef) Long.valueOf(bundle.getLong("Messaging.Arguments.MessageRef", 0L));
            } else {
                g720Var = b;
                u = a.equals(qoi0.a(long[].class)) ? (ServerMessageRef) bundle.getLongArray("Messaging.Arguments.MessageRef") : a.equals(qoi0.a(cls4)) ? (ServerMessageRef) Float.valueOf(bundle.getFloat("Messaging.Arguments.MessageRef")) : a.equals(qoi0.a(float[].class)) ? (ServerMessageRef) bundle.getFloatArray("Messaging.Arguments.MessageRef") : a.equals(qoi0.a(cls3)) ? (ServerMessageRef) Double.valueOf(bundle.getDouble("Messaging.Arguments.MessageRef")) : a.equals(qoi0.a(double[].class)) ? (ServerMessageRef) bundle.getDoubleArray("Messaging.Arguments.MessageRef") : a.equals(qoi0.a(cls2)) ? (ServerMessageRef) Character.valueOf(bundle.getChar("Messaging.Arguments.MessageRef")) : a.equals(qoi0.a(CharSequence.class)) ? (ServerMessageRef) bundle.getCharSequence("Messaging.Arguments.MessageRef") : a.equals(qoi0.a(CharSequence[].class)) ? (ServerMessageRef) bundle.getCharSequenceArray("Messaging.Arguments.MessageRef") : a.equals(qoi0.a(Bundle.class)) ? (ServerMessageRef) bundle.getBundle("Messaging.Arguments.MessageRef") : vng.u(bundle, ServerMessageRef.class, "Messaging.Arguments.MessageRef");
            }
            g720Var = b;
        } else {
            cls = cls9;
            g720Var = b;
            u = null;
        }
        ServerMessageRef serverMessageRef = (ServerMessageRef) u;
        if (bundle.containsKey("Messaging.Arguments.LocalMessageRef")) {
            g0c a2 = qoi0.a(LocalMessageRef.class);
            if (a2.equals(qoi0.a(cls))) {
                u2 = (LocalMessageRef) Boolean.valueOf(bundle.getBoolean("Messaging.Arguments.LocalMessageRef", true));
            } else if (a2.equals(qoi0.a(cls8))) {
                u2 = (LocalMessageRef) bundle.getByte("Messaging.Arguments.LocalMessageRef", (byte) 0);
            } else if (a2.equals(qoi0.a(byte[].class))) {
                u2 = (LocalMessageRef) bundle.getByteArray("Messaging.Arguments.LocalMessageRef");
            } else if (a2.equals(qoi0.a(cls7))) {
                u2 = (LocalMessageRef) Short.valueOf(bundle.getShort("Messaging.Arguments.LocalMessageRef"));
            } else if (a2.equals(qoi0.a(cls6))) {
                u2 = (LocalMessageRef) Integer.valueOf(bundle.getInt("Messaging.Arguments.LocalMessageRef", 0));
            } else if (a2.equals(qoi0.a(int[].class))) {
                u2 = (LocalMessageRef) bundle.getIntArray("Messaging.Arguments.LocalMessageRef");
            } else if (a2.equals(qoi0.a(cls5))) {
                chatRequest = chatRequest2;
                u2 = (LocalMessageRef) Long.valueOf(bundle.getLong("Messaging.Arguments.LocalMessageRef", 0L));
            } else {
                chatRequest = chatRequest2;
                u2 = a2.equals(qoi0.a(long[].class)) ? (LocalMessageRef) bundle.getLongArray("Messaging.Arguments.LocalMessageRef") : a2.equals(qoi0.a(cls4)) ? (LocalMessageRef) Float.valueOf(bundle.getFloat("Messaging.Arguments.LocalMessageRef")) : a2.equals(qoi0.a(float[].class)) ? (LocalMessageRef) bundle.getFloatArray("Messaging.Arguments.LocalMessageRef") : a2.equals(qoi0.a(cls3)) ? (LocalMessageRef) Double.valueOf(bundle.getDouble("Messaging.Arguments.LocalMessageRef")) : a2.equals(qoi0.a(double[].class)) ? (LocalMessageRef) bundle.getDoubleArray("Messaging.Arguments.LocalMessageRef") : a2.equals(qoi0.a(cls2)) ? (LocalMessageRef) Character.valueOf(bundle.getChar("Messaging.Arguments.LocalMessageRef")) : a2.equals(qoi0.a(CharSequence.class)) ? (LocalMessageRef) bundle.getCharSequence("Messaging.Arguments.LocalMessageRef") : a2.equals(qoi0.a(CharSequence[].class)) ? (LocalMessageRef) bundle.getCharSequenceArray("Messaging.Arguments.LocalMessageRef") : a2.equals(qoi0.a(Bundle.class)) ? (LocalMessageRef) bundle.getBundle("Messaging.Arguments.LocalMessageRef") : vng.u(bundle, LocalMessageRef.class, "Messaging.Arguments.LocalMessageRef");
            }
            chatRequest = chatRequest2;
        } else {
            chatRequest = chatRequest2;
            u2 = null;
        }
        LocalMessageRef localMessageRef2 = (LocalMessageRef) u2;
        boolean z3 = bundle.getBoolean("Messaging.Arguments.Invite");
        boolean z4 = bundle.getBoolean("Messaging.Arguments.Join");
        String string4 = bundle.getString("Messaging.Arguments.BotRequest");
        boolean z5 = bundle.getBoolean("Messaging.Arguments.OpenSearch");
        u6b u6bVar = ChatOpenTarget.Companion;
        String string5 = bundle.getString("Messaging.Arguments.Target");
        u6bVar.getClass();
        ChatOpenTarget a3 = u6b.a(string5);
        boolean z6 = bundle.getBoolean("Messaging.Arguments.FromNotification");
        long[] longArray = bundle.getLongArray("Messaging.Arguments.MessageTimestamps");
        List c0 = longArray != null ? j73.c0(longArray) : null;
        m5g0 m5g0Var = (bundle.getBoolean("has_xiva_data") ? bundle : null) != null ? new m5g0(bundle.getString("transit_id"), bundle.getLong("receive_ts"), bundle.getLong("receive_ts_uptime")) : null;
        hqr0 r = bcb1.r(bundle);
        String string6 = bundle.getString("Messaging.Arguments.STICKERPACK");
        String string7 = bundle.getString("Messaging.Arguments.SupportContext");
        boolean z7 = bundle.getBoolean("Messaging.Arguments.OpenKeyboard");
        if (bundle.containsKey("Messaging.Arguments.IsolatedChatConfig")) {
            localMessageRef = localMessageRef2;
            z = z3;
            g0c a4 = qoi0.a(IsolatedChatConfig.class);
            z2 = z4;
            if (a4.equals(qoi0.a(cls))) {
                obj2 = (IsolatedChatConfig) Boolean.valueOf(bundle.getBoolean("Messaging.Arguments.IsolatedChatConfig", true));
            } else if (a4.equals(qoi0.a(cls8))) {
                Object obj3 = bundle.getByte("Messaging.Arguments.IsolatedChatConfig", (byte) 0);
                if (obj3 == null) {
                    ny61.t("null cannot be cast to non-null type com.yandex.messaging.isolated.IsolatedChatConfig");
                    throw null;
                }
                obj2 = (IsolatedChatConfig) obj3;
            } else if (a4.equals(qoi0.a(byte[].class))) {
                Object byteArray = bundle.getByteArray("Messaging.Arguments.IsolatedChatConfig");
                if (byteArray == null) {
                    ny61.t("null cannot be cast to non-null type com.yandex.messaging.isolated.IsolatedChatConfig");
                    throw null;
                }
                obj2 = (IsolatedChatConfig) byteArray;
            } else if (a4.equals(qoi0.a(cls7))) {
                obj2 = (IsolatedChatConfig) Short.valueOf(bundle.getShort("Messaging.Arguments.IsolatedChatConfig"));
            } else if (a4.equals(qoi0.a(cls6))) {
                obj2 = (IsolatedChatConfig) Integer.valueOf(bundle.getInt("Messaging.Arguments.IsolatedChatConfig", 0));
            } else if (a4.equals(qoi0.a(int[].class))) {
                Object intArray = bundle.getIntArray("Messaging.Arguments.IsolatedChatConfig");
                if (intArray == null) {
                    ny61.t("null cannot be cast to non-null type com.yandex.messaging.isolated.IsolatedChatConfig");
                    throw null;
                }
                obj2 = (IsolatedChatConfig) intArray;
            } else {
                if (a4.equals(qoi0.a(cls5))) {
                    str = string4;
                    u3 = (IsolatedChatConfig) Long.valueOf(bundle.getLong("Messaging.Arguments.IsolatedChatConfig", 0L));
                } else {
                    str = string4;
                    if (a4.equals(qoi0.a(long[].class))) {
                        Object longArray2 = bundle.getLongArray("Messaging.Arguments.IsolatedChatConfig");
                        if (longArray2 == null) {
                            ny61.t("null cannot be cast to non-null type com.yandex.messaging.isolated.IsolatedChatConfig");
                            throw null;
                        }
                        u3 = (IsolatedChatConfig) longArray2;
                    } else if (a4.equals(qoi0.a(cls4))) {
                        u3 = (IsolatedChatConfig) Float.valueOf(bundle.getFloat("Messaging.Arguments.IsolatedChatConfig"));
                    } else if (a4.equals(qoi0.a(float[].class))) {
                        Object floatArray = bundle.getFloatArray("Messaging.Arguments.IsolatedChatConfig");
                        if (floatArray == null) {
                            ny61.t("null cannot be cast to non-null type com.yandex.messaging.isolated.IsolatedChatConfig");
                            throw null;
                        }
                        u3 = (IsolatedChatConfig) floatArray;
                    } else if (a4.equals(qoi0.a(cls3))) {
                        u3 = (IsolatedChatConfig) Double.valueOf(bundle.getDouble("Messaging.Arguments.IsolatedChatConfig"));
                    } else if (a4.equals(qoi0.a(double[].class))) {
                        Object doubleArray = bundle.getDoubleArray("Messaging.Arguments.IsolatedChatConfig");
                        if (doubleArray == null) {
                            ny61.t("null cannot be cast to non-null type com.yandex.messaging.isolated.IsolatedChatConfig");
                            throw null;
                        }
                        u3 = (IsolatedChatConfig) doubleArray;
                    } else if (a4.equals(qoi0.a(cls2))) {
                        u3 = (IsolatedChatConfig) Character.valueOf(bundle.getChar("Messaging.Arguments.IsolatedChatConfig"));
                    } else if (a4.equals(qoi0.a(CharSequence.class))) {
                        Object charSequence = bundle.getCharSequence("Messaging.Arguments.IsolatedChatConfig");
                        if (charSequence == null) {
                            ny61.t("null cannot be cast to non-null type com.yandex.messaging.isolated.IsolatedChatConfig");
                            throw null;
                        }
                        u3 = (IsolatedChatConfig) charSequence;
                    } else if (a4.equals(qoi0.a(CharSequence[].class))) {
                        Object charSequenceArray = bundle.getCharSequenceArray("Messaging.Arguments.IsolatedChatConfig");
                        if (charSequenceArray == null) {
                            ny61.t("null cannot be cast to non-null type com.yandex.messaging.isolated.IsolatedChatConfig");
                            throw null;
                        }
                        u3 = (IsolatedChatConfig) charSequenceArray;
                    } else if (a4.equals(qoi0.a(Bundle.class))) {
                        Object bundle2 = bundle.getBundle("Messaging.Arguments.IsolatedChatConfig");
                        if (bundle2 == null) {
                            ny61.t("null cannot be cast to non-null type com.yandex.messaging.isolated.IsolatedChatConfig");
                            throw null;
                        }
                        u3 = (IsolatedChatConfig) bundle2;
                    } else {
                        u3 = vng.u(bundle, IsolatedChatConfig.class, "Messaging.Arguments.IsolatedChatConfig");
                    }
                }
                obj = u3;
            }
            obj = obj2;
            str = string4;
        } else {
            localMessageRef = localMessageRef2;
            z = z3;
            z2 = z4;
            str = string4;
            obj = null;
        }
    }

    @Override // defpackage.s120
    public final String a() {
        return this.v;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6b)) {
            return false;
        }
        q6b q6bVar = (q6b) obj;
        return jl40.l(this.a, q6bVar.a) && jl40.l(this.b, q6bVar.b) && jl40.l(this.c, q6bVar.c) && jl40.l(this.d, q6bVar.d) && jl40.l(this.e, q6bVar.e) && jl40.l(this.f, q6bVar.f) && this.g == q6bVar.g && this.h == q6bVar.h && jl40.l(this.i, q6bVar.i) && this.j == q6bVar.j && this.k == q6bVar.k && this.l == q6bVar.l && jl40.l(this.m, q6bVar.m) && jl40.l(this.n, q6bVar.n) && jl40.l(this.o, q6bVar.o) && jl40.l(this.p, q6bVar.p) && jl40.l(this.q, q6bVar.q) && this.r == q6bVar.r && jl40.l(this.s, q6bVar.s) && this.t == q6bVar.t && jl40.l(this.u, q6bVar.u);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ServerMessageRef serverMessageRef = this.e;
        int hashCode4 = (hashCode3 + (serverMessageRef == null ? 0 : serverMessageRef.hashCode())) * 31;
        LocalMessageRef localMessageRef = this.f;
        int e = unr0.e(unr0.e((hashCode4 + (localMessageRef == null ? 0 : localMessageRef.hashCode())) * 31, 31, this.g), 31, this.h);
        String str3 = this.i;
        int e2 = unr0.e((e + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j);
        ChatOpenTarget chatOpenTarget = this.k;
        int e3 = unr0.e((e2 + (chatOpenTarget == null ? 0 : chatOpenTarget.hashCode())) * 31, 31, this.l);
        List list = this.m;
        int hashCode5 = (e3 + (list == null ? 0 : list.hashCode())) * 31;
        m5g0 m5g0Var = this.n;
        int hashCode6 = (hashCode5 + (m5g0Var == null ? 0 : m5g0Var.hashCode())) * 31;
        hqr0 hqr0Var = this.o;
        int hashCode7 = (hashCode6 + (hqr0Var == null ? 0 : hqr0Var.hashCode())) * 31;
        String str4 = this.p;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.q;
        int e4 = unr0.e((hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.r);
        IsolatedChatConfig isolatedChatConfig = this.s;
        int e5 = unr0.e((e4 + (isolatedChatConfig == null ? 0 : isolatedChatConfig.hashCode())) * 31, 31, this.t);
        String str6 = this.u;
        return e5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.j;
        boolean z2 = this.r;
        StringBuilder sb = new StringBuilder("ChatOpenArguments(source=");
        sb.append(this.a);
        sb.append(", chatRequest=");
        sb.append(this.b);
        sb.append(", text=");
        g8e.D(sb, this.c, ", payload=", this.d, ", messageRef=");
        sb.append(this.e);
        sb.append(", localMessageRef=");
        sb.append(this.f);
        sb.append(", invite=");
        nnm.v(", join=", ", botRequest=", sb, this.g, this.h);
        tse0.y(this.i, ", openSearch=", ", chatOpenTarget=", sb, z);
        sb.append(this.k);
        sb.append(", isFromNotification=");
        sb.append(this.l);
        sb.append(", messageTimestamps=");
        sb.append(this.m);
        sb.append(", pushXivaData=");
        sb.append(this.n);
        sb.append(", sharingData=");
        sb.append(this.o);
        sb.append(", stickerPack=");
        sb.append(this.p);
        sb.append(", supportContextJson=");
        tse0.y(this.q, ", openKeyboard=", ", isolatedChatConfig=", sb, z2);
        sb.append(this.s);
        sb.append(", isFromPersonalInviteLink=");
        sb.append(this.t);
        sb.append(", action=");
        return oyr.t(sb, this.u, Extension.C_BRAKE);
    }

    public q6b(g720 g720Var, ChatRequest chatRequest, String str, String str2, ServerMessageRef serverMessageRef, LocalMessageRef localMessageRef, boolean z, boolean z2, String str3, boolean z3, ChatOpenTarget chatOpenTarget, boolean z4, List list, m5g0 m5g0Var, hqr0 hqr0Var, String str4, String str5, boolean z5, IsolatedChatConfig isolatedChatConfig, boolean z6, String str6) {
        this.a = g720Var;
        this.b = chatRequest;
        this.c = str;
        this.d = str2;
        this.e = serverMessageRef;
        this.f = localMessageRef;
        this.g = z;
        this.h = z2;
        this.i = str3;
        this.j = z3;
        this.k = chatOpenTarget;
        this.l = z4;
        this.m = list;
        this.n = m5g0Var;
        this.o = hqr0Var;
        this.p = str4;
        this.q = str5;
        this.r = z5;
        this.s = isolatedChatConfig;
        this.t = z6;
        this.u = str6;
        this.v = "Messaging.Arguments.Key.ChatOpen";
        this.w = isolatedChatConfig != null;
    }

    public /* synthetic */ q6b(g720 g720Var, ChatRequest chatRequest, ServerMessageRef serverMessageRef, String str, IsolatedChatConfig isolatedChatConfig, int i) {
        this(g720Var, chatRequest, null, null, (i & 16) != 0 ? null : serverMessageRef, null, false, false, null, false, null, false, null, null, null, null, (i & 65536) != 0 ? null : str, (i & 131072) == 0, (i & 262144) != 0 ? null : isolatedChatConfig, false, null);
    }
}
