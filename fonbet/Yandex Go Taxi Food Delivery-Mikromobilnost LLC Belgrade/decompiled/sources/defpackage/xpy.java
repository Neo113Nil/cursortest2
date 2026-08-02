package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodSubtype;
import com.yandex.go.preorder.navigation.c;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Pair;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.video.m3.list_player_manager.impl.InitParameters;

/* loaded from: classes13.dex */
public final /* synthetic */ class xpy implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ xpy(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ypy ypyVar = (ypy) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(ypyVar.d);
                sb.append('=');
                sb.append(ypyVar.e);
                return sb.toString();
            case 1:
                return new pbv((dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
            case 2:
                return new pbv((dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
            case 3:
                ((q4l) obj).onPause();
                return zy11Var;
            case 4:
                InitParameters.Builder builder = (InitParameters.Builder) obj;
                builder.setPlayerLogsEnabled(false);
                builder.setAutomaticallyHandleAudioFocus(false);
                builder.setJsonFlags("{\"blurHashOnOtherThread\":true}");
                return zy11Var;
            case 5:
                return (tbv) ((Pair) obj).getFirst();
            case 6:
                return (tbv) ((Pair) obj).getFirst();
            case 7:
                return new j1z((View) obj);
            case 8:
                return new wt((ShimmeringBar) obj, 2);
            case 9:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("DELETE FROM local_contacts WHERE locals_deleted=1");
                try {
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 10:
                oll0 oll0Var2 = (oll0) obj;
                T0 = oll0Var2.T0("UPDATE local_contacts SET locals_deleted=1 WHERE locals_deleted != 1");
                try {
                    T0.q();
                    int x2 = jx81.x(oll0Var2);
                    T0.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 11:
                T0 = ((oll0) obj).T0("SELECT * FROM local_contacts");
                try {
                    int r = eja1.r(T0, "locals_upload_id");
                    int r2 = eja1.r(T0, "locals_system_id");
                    int r3 = eja1.r(T0, "locals_uploaded");
                    int r4 = eja1.r(T0, "locals_display_name");
                    int r5 = eja1.r(T0, "locals_phone");
                    int r6 = eja1.r(T0, "locals_phone_id");
                    int r7 = eja1.r(T0, "locals_last_time_contacted");
                    int r8 = eja1.r(T0, "locals_dirty");
                    int r9 = eja1.r(T0, "locals_deleted");
                    int r10 = eja1.r(T0, "locals_lookup_id");
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(new h2z(T0.Y1(r), T0.getLong(r2), ((int) T0.getLong(r3)) != 0, T0.isNull(r4) ? null : T0.Y1(r4), T0.Y1(r5), T0.isNull(r6) ? null : T0.Y1(r6), T0.getLong(r7), ((int) T0.getLong(r8)) != 0, ((int) T0.getLong(r9)) != 0, T0.Y1(r10)));
                    }
                    return arrayList;
                } finally {
                }
            case 12:
                T0 = ((oll0) obj).T0("SELECT * FROM local_contacts WHERE locals_deleted = 0 AND locals_dirty != 0");
                try {
                    int r11 = eja1.r(T0, "locals_upload_id");
                    int r12 = eja1.r(T0, "locals_system_id");
                    int r13 = eja1.r(T0, "locals_uploaded");
                    int r14 = eja1.r(T0, "locals_display_name");
                    int r15 = eja1.r(T0, "locals_phone");
                    int r16 = eja1.r(T0, "locals_phone_id");
                    int r17 = eja1.r(T0, "locals_last_time_contacted");
                    int r18 = eja1.r(T0, "locals_dirty");
                    int r19 = eja1.r(T0, "locals_deleted");
                    int r20 = eja1.r(T0, "locals_lookup_id");
                    ArrayList arrayList2 = new ArrayList();
                    while (T0.q()) {
                        arrayList2.add(new h2z(T0.Y1(r11), T0.getLong(r12), ((int) T0.getLong(r13)) != 0, T0.isNull(r14) ? null : T0.Y1(r14), T0.Y1(r15), T0.isNull(r16) ? null : T0.Y1(r16), T0.getLong(r17), ((int) T0.getLong(r18)) != 0, ((int) T0.getLong(r19)) != 0, T0.Y1(r20)));
                    }
                    return arrayList2;
                } finally {
                }
            case 13:
                T0 = ((oll0) obj).T0("SELECT locals_phone_id FROM local_contacts  WHERE locals_uploaded=1 AND locals_deleted != 0 AND locals_phone_id IS NOT NULL");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (T0.q()) {
                        arrayList3.add(T0.Y1(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 14:
                T0 = ((oll0) obj).T0("SELECT COUNT(99) FROM local_contacts WHERE locals_deleted != 1");
                try {
                    int i2 = T0.q() ? (int) T0.getLong(0) : 0;
                    T0.close();
                    return Integer.valueOf(i2);
                } finally {
                }
            case 15:
                oll0 oll0Var3 = (oll0) obj;
                T0 = oll0Var3.T0("DELETE FROM local_contacts");
                try {
                    T0.q();
                    int x3 = jx81.x(oll0Var3);
                    T0.close();
                    return Integer.valueOf(x3);
                } finally {
                }
            case 16:
                ooc.f((lrg) obj, 't');
                return zy11Var;
            case 17:
                ooc.f((lrg) obj, 'T');
                return zy11Var;
            case 18:
                i3y i3yVar = w4z.a;
                return zy11Var;
            case 19:
                mrg mrgVar = (mrg) obj;
                ooc.f(mrgVar, ':');
                mrg.l(mrgVar);
                ooc.v(mrgVar, "", new xpy(20));
                return zy11Var;
            case 20:
                mrg mrgVar2 = (mrg) obj;
                ooc.f(mrgVar2, '.');
                ((va) mrgVar2).c(new xd5(new ibs()));
                return zy11Var;
            case 21:
                return Boolean.valueOf(jl40.l(((InputMethodSubtype) obj).getMode(), "keyboard"));
            case 22:
                return new Locale(((InputMethodSubtype) obj).getLocale());
            case 23:
                sqe0 sqe0Var = (sqe0) obj;
                c.c0(sqe0Var.a, null, 31);
                sqe0Var.a.U.a();
                return zy11Var;
            case 24:
                c.c0(((sqe0) obj).a, null, 31);
                return zy11Var;
            case 25:
                c.c0(((sqe0) obj).a, null, 31);
                return zy11Var;
            case 26:
                return new b8z((View) obj);
            case 27:
                ((idz) obj).r0();
                return zy11Var;
            case 28:
                ((idz) obj).r0();
                return zy11Var;
            default:
                ((idz) obj).r0();
                return zy11Var;
        }
    }
}
