package defpackage;

import androidx.room.util.a;
import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.internal.entities.ChatId;

/* loaded from: classes15.dex */
public final class z8b {
    public final meb a;
    public final x8b b;
    public final ph9 c;

    public z8b(meb mebVar, x8b x8bVar, ph9 ph9Var) {
        this.a = mebVar;
        this.b = x8bVar;
        this.c = ph9Var;
    }

    public static s8b b(s8b s8bVar, int i, int i2) {
        ay4 b;
        ChatRightsFlag chatRightsFlag = ChatRightsFlag.Join;
        ChatRightsFlag chatRightsFlag2 = ChatRightsFlag.Leave;
        ChatRightsFlag chatRightsFlag3 = ChatRightsFlag.Write;
        ay4 b2 = ay4.b(s8bVar, null, new by4[]{chatRightsFlag, chatRightsFlag2, chatRightsFlag3}, 1);
        if (i2 == 3) {
            return (s8b) b2;
        }
        if (!s8bVar.m()) {
            if (s8bVar.k()) {
                b = i == 3 ? ay4.b(b2, new by4[]{chatRightsFlag}, null, 2) : ay4.b(b2, new by4[]{chatRightsFlag2}, null, 2);
            }
            return (s8b) b2;
        }
        b = i == 3 ? ay4.b(b2, new by4[]{chatRightsFlag, chatRightsFlag3}, null, 2) : ay4.b(b2, new by4[]{chatRightsFlag2, chatRightsFlag3}, null, 2);
        b2 = b;
        return (s8b) b2;
    }

    public final void a(long j, long j2, String str) {
        y8b a = this.b.a(j2);
        wbz0 wbz0Var = s8b.c;
        int i = a != null ? a.d : 0;
        wbz0Var.getClass();
        c(str, j, b(new s8b(i), 3, a != null ? a.c : 3).b, 3, 0L, false);
    }

    public final void c(String str, long j, int i, int i2, long j2, boolean z) {
        int i3;
        int i4;
        x8b x8bVar = this.b;
        Long l = (Long) a.b(x8bVar.a, true, false, new cs0(j, 28));
        long longValue = l != null ? l.longValue() : -1L;
        if (longValue <= j2) {
            if (z || longValue != j2) {
                y8b a = x8bVar.a(j);
                x8bVar.b(new y8b(i2, i, j, j2));
                ph9 ph9Var = this.c;
                ph9Var.a(j);
                ChatId a2 = ChatId.Companion.a(str);
                if (!(a2 instanceof ChatId.ThreadId) || ((ChatId.ThreadId) a2).d < 0) {
                    Long[] lArr = (Long[]) a.b(this.a.a, true, false, new hcb(j, 5));
                    if (lArr.length == 0) {
                        return;
                    }
                    int i5 = a != null ? a.c : 3;
                    wbz0 wbz0Var = s8b.c;
                    int i6 = a != null ? a.d : 0;
                    wbz0Var.getClass();
                    s8b s8bVar = new s8b(i6);
                    s8b s8bVar2 = new s8b(i);
                    if (i5 == i2 && s8bVar2.m() == s8bVar.m() && s8bVar2.k() == s8bVar.k()) {
                        return;
                    }
                    for (Long l2 : lArr) {
                        long longValue2 = l2.longValue();
                        y8b a3 = x8bVar.a(longValue2);
                        int i7 = a3 != null ? a3.c : 3;
                        if (i5 != i2) {
                            if (i2 == 3) {
                                i3 = 3;
                            } else if (i5 != 3 && i7 != 3) {
                                i3 = i2;
                            }
                            i4 = b(s8bVar2, i3, i2).b;
                            if (i3 == i7 || a3 == null || i4 != a3.d) {
                                x8bVar.b(new y8b(i3, i4, longValue2, 0L));
                                ph9Var.a(longValue2);
                                ph9Var.c.d(e9h0.payload_thread_list_changed, Boolean.TRUE);
                            }
                        }
                        i3 = i7;
                        i4 = b(s8bVar2, i3, i2).b;
                        if (i3 == i7) {
                        }
                        x8bVar.b(new y8b(i3, i4, longValue2, 0L));
                        ph9Var.a(longValue2);
                        ph9Var.c.d(e9h0.payload_thread_list_changed, Boolean.TRUE);
                    }
                }
            }
        }
    }
}
