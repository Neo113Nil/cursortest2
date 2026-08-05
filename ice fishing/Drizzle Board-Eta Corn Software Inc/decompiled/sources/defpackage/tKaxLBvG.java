package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.kolosta.rejin.jilosa.R;
import defpackage.nj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class tKaxLBvG implements zk {
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ tKaxLBvG(v30 v30Var) {
        this.NCTxEWno = 27;
    }

    @Override // defpackage.zk
    public final Object ow5vqvCr(Object obj) {
        h40 Ey6iv0m0;
        int i;
        switch (this.NCTxEWno) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                f40 f40Var = (f40) obj;
                f40Var.getClass();
                Ey6iv0m0 = f40Var.Ey6iv0m0("SELECT * FROM compares ORDER BY comparedAt DESC LIMIT ?");
                try {
                    Ey6iv0m0.qoPGr6Ce(1, 3L);
                    int sjUBp5pO = le0.sjUBp5pO(Ey6iv0m0, "id");
                    int sjUBp5pO2 = le0.sjUBp5pO(Ey6iv0m0, "leftId");
                    int sjUBp5pO3 = le0.sjUBp5pO(Ey6iv0m0, "rightId");
                    int sjUBp5pO4 = le0.sjUBp5pO(Ey6iv0m0, "comparedAt");
                    ArrayList arrayList = new ArrayList();
                    while (Ey6iv0m0.amk52bBQ()) {
                        arrayList.add(new p6(Ey6iv0m0.getLong(sjUBp5pO), Ey6iv0m0.getLong(sjUBp5pO2), Ey6iv0m0.getLong(sjUBp5pO3), Ey6iv0m0.getLong(sjUBp5pO4)));
                    }
                    return arrayList;
                } finally {
                }
            case 2:
                f40 f40Var2 = (f40) obj;
                f40Var2.getClass();
                Ey6iv0m0 = f40Var2.Ey6iv0m0("SELECT COUNT(*) FROM compares");
                try {
                    i = Ey6iv0m0.amk52bBQ() ? (int) Ey6iv0m0.getLong(0) : 0;
                    Ey6iv0m0.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 3:
                j9 j9Var = (j9) obj;
                if (j9Var instanceof n9) {
                    return (n9) j9Var;
                }
                return null;
            case 4:
                return obj;
            case 5:
                ((aa) obj).getClass();
                return new nj.qoPGr6Ce();
            case 6:
                f40 f40Var3 = (f40) obj;
                f40Var3.getClass();
                Ey6iv0m0 = f40Var3.Ey6iv0m0("SELECT * FROM mood_state WHERE id = 1");
                try {
                    int sjUBp5pO5 = le0.sjUBp5pO(Ey6iv0m0, "id");
                    int sjUBp5pO6 = le0.sjUBp5pO(Ey6iv0m0, "moodKey");
                    int sjUBp5pO7 = le0.sjUBp5pO(Ey6iv0m0, "introShown");
                    int sjUBp5pO8 = le0.sjUBp5pO(Ey6iv0m0, "ratingDismissedFor");
                    if (Ey6iv0m0.amk52bBQ()) {
                        r22 = new xs((int) Ey6iv0m0.getLong(sjUBp5pO5), Ey6iv0m0.wxUZMvaN(sjUBp5pO6), ((int) Ey6iv0m0.getLong(sjUBp5pO7)) != 0, Ey6iv0m0.getLong(sjUBp5pO8));
                    }
                    return r22;
                } finally {
                }
            case 7:
                f40 f40Var4 = (f40) obj;
                f40Var4.getClass();
                Ey6iv0m0 = f40Var4.Ey6iv0m0("SELECT * FROM mood_state WHERE id = 1");
                try {
                    int sjUBp5pO9 = le0.sjUBp5pO(Ey6iv0m0, "id");
                    int sjUBp5pO10 = le0.sjUBp5pO(Ey6iv0m0, "moodKey");
                    int sjUBp5pO11 = le0.sjUBp5pO(Ey6iv0m0, "introShown");
                    int sjUBp5pO12 = le0.sjUBp5pO(Ey6iv0m0, "ratingDismissedFor");
                    if (Ey6iv0m0.amk52bBQ()) {
                        r22 = new xs((int) Ey6iv0m0.getLong(sjUBp5pO9), Ey6iv0m0.wxUZMvaN(sjUBp5pO10), ((int) Ey6iv0m0.getLong(sjUBp5pO11)) != 0, Ey6iv0m0.getLong(sjUBp5pO12));
                    }
                    return r22;
                } finally {
                }
            case 8:
                aa aaVar = (aa) obj;
                aaVar.getClass();
                return new vt(w30.sjUBp5pO(aaVar));
            case 9:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 10:
                pu puVar = (pu) obj;
                puVar.getClass();
                ru ruVar = puVar.wxUZMvaN;
                if (ruVar == null || ruVar.Qr9iLBAD.qoPGr6Ce != puVar.MdtA4re8.qoPGr6Ce) {
                    return null;
                }
                return ruVar;
            case 11:
                pu puVar2 = (pu) obj;
                puVar2.getClass();
                ru ruVar2 = puVar2.wxUZMvaN;
                if (ruVar2 == null || ruVar2.Qr9iLBAD.qoPGr6Ce != puVar2.MdtA4re8.qoPGr6Ce) {
                    return null;
                }
                return ruVar2;
            case 12:
                pu puVar3 = (pu) obj;
                puVar3.getClass();
                return Integer.valueOf(puVar3.MdtA4re8.qoPGr6Ce);
            case 13:
                ((aa) obj).getClass();
                return new hu();
            case 14:
                Context context3 = (Context) obj;
                context3.getClass();
                ContextWrapper contextWrapper = context3 instanceof ContextWrapper ? (ContextWrapper) context3 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 15:
                Context context4 = (Context) obj;
                context4.getClass();
                if (context4 instanceof Activity) {
                    return (Activity) context4;
                }
                return null;
            case 16:
                pu puVar4 = (pu) obj;
                puVar4.getClass();
                return puVar4.wxUZMvaN;
            case 17:
                pu puVar5 = (pu) obj;
                puVar5.getClass();
                if (!(puVar5 instanceof ru)) {
                    return null;
                }
                ru ruVar3 = (ru) puVar5;
                return ruVar3.Qr9iLBAD(ruVar3.Qr9iLBAD.qoPGr6Ce);
            case 18:
                View view = (View) obj;
                view.getClass();
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 19:
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (uu) ((WeakReference) tag).get();
                }
                if (tag instanceof uu) {
                    return (uu) tag;
                }
                return null;
            case 20:
                f40 f40Var5 = (f40) obj;
                f40Var5.getClass();
                Ey6iv0m0 = f40Var5.Ey6iv0m0("SELECT COUNT(*) FROM pairings");
                try {
                    i = Ey6iv0m0.amk52bBQ() ? (int) Ey6iv0m0.getLong(0) : 0;
                    Ey6iv0m0.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 21:
                f40 f40Var6 = (f40) obj;
                f40Var6.getClass();
                Ey6iv0m0 = f40Var6.Ey6iv0m0("SELECT COUNT(*) FROM pairings WHERE openedAt > 0");
                try {
                    i = Ey6iv0m0.amk52bBQ() ? (int) Ey6iv0m0.getLong(0) : 0;
                    Ey6iv0m0.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 22:
                f40 f40Var7 = (f40) obj;
                f40Var7.getClass();
                Ey6iv0m0 = f40Var7.Ey6iv0m0("SELECT COUNT(*) FROM pairings");
                try {
                    i = Ey6iv0m0.amk52bBQ() ? (int) Ey6iv0m0.getLong(0) : 0;
                    Ey6iv0m0.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 23:
                f40 f40Var8 = (f40) obj;
                f40Var8.getClass();
                Ey6iv0m0 = f40Var8.Ey6iv0m0("SELECT COUNT(*) FROM pairings WHERE rating > 0");
                try {
                    i = Ey6iv0m0.amk52bBQ() ? (int) Ey6iv0m0.getLong(0) : 0;
                    Ey6iv0m0.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 24:
                f40 f40Var9 = (f40) obj;
                f40Var9.getClass();
                Ey6iv0m0 = f40Var9.Ey6iv0m0("SELECT * FROM pairings ORDER BY name ASC");
                try {
                    int sjUBp5pO13 = le0.sjUBp5pO(Ey6iv0m0, "id");
                    int sjUBp5pO14 = le0.sjUBp5pO(Ey6iv0m0, "name");
                    int sjUBp5pO15 = le0.sjUBp5pO(Ey6iv0m0, "emoji");
                    int sjUBp5pO16 = le0.sjUBp5pO(Ey6iv0m0, "subtitle");
                    int sjUBp5pO17 = le0.sjUBp5pO(Ey6iv0m0, "description");
                    int sjUBp5pO18 = le0.sjUBp5pO(Ey6iv0m0, "sauceBase");
                    int sjUBp5pO19 = le0.sjUBp5pO(Ey6iv0m0, "intensity");
                    int sjUBp5pO20 = le0.sjUBp5pO(Ey6iv0m0, "intensityLevel");
                    int sjUBp5pO21 = le0.sjUBp5pO(Ey6iv0m0, "prepMinutes");
                    int sjUBp5pO22 = le0.sjUBp5pO(Ey6iv0m0, "cuisine");
                    int sjUBp5pO23 = le0.sjUBp5pO(Ey6iv0m0, "scope");
                    int sjUBp5pO24 = le0.sjUBp5pO(Ey6iv0m0, "tags");
                    int sjUBp5pO25 = le0.sjUBp5pO(Ey6iv0m0, "contextNote");
                    int sjUBp5pO26 = le0.sjUBp5pO(Ey6iv0m0, "flow");
                    int sjUBp5pO27 = le0.sjUBp5pO(Ey6iv0m0, "popularity");
                    int sjUBp5pO28 = le0.sjUBp5pO(Ey6iv0m0, "novelty");
                    int sjUBp5pO29 = le0.sjUBp5pO(Ey6iv0m0, "openedAt");
                    int sjUBp5pO30 = le0.sjUBp5pO(Ey6iv0m0, "rating");
                    ArrayList arrayList2 = new ArrayList();
                    while (Ey6iv0m0.amk52bBQ()) {
                        int i2 = sjUBp5pO15;
                        int i3 = sjUBp5pO17;
                        int i4 = sjUBp5pO27;
                        int i5 = sjUBp5pO16;
                        int i6 = sjUBp5pO14;
                        int i7 = sjUBp5pO28;
                        int i8 = sjUBp5pO30;
                        arrayList2.add(new oy(Ey6iv0m0.getLong(sjUBp5pO13), Ey6iv0m0.wxUZMvaN(sjUBp5pO14), Ey6iv0m0.wxUZMvaN(sjUBp5pO15), Ey6iv0m0.wxUZMvaN(sjUBp5pO16), Ey6iv0m0.wxUZMvaN(sjUBp5pO17), Ey6iv0m0.wxUZMvaN(sjUBp5pO18), Ey6iv0m0.wxUZMvaN(sjUBp5pO19), (int) Ey6iv0m0.getLong(sjUBp5pO20), (int) Ey6iv0m0.getLong(sjUBp5pO21), Ey6iv0m0.wxUZMvaN(sjUBp5pO22), Ey6iv0m0.wxUZMvaN(sjUBp5pO23), Ey6iv0m0.wxUZMvaN(sjUBp5pO24), Ey6iv0m0.wxUZMvaN(sjUBp5pO25), Ey6iv0m0.wxUZMvaN(sjUBp5pO26), (int) Ey6iv0m0.getLong(i4), (int) Ey6iv0m0.getLong(i7), Ey6iv0m0.getLong(sjUBp5pO29), (int) Ey6iv0m0.getLong(i8)));
                        sjUBp5pO30 = i8;
                        sjUBp5pO28 = i7;
                        sjUBp5pO15 = i2;
                        sjUBp5pO17 = i3;
                        sjUBp5pO16 = i5;
                        sjUBp5pO14 = i6;
                        sjUBp5pO27 = i4;
                    }
                    return arrayList2;
                } finally {
                }
            case 25:
                f40 f40Var10 = (f40) obj;
                f40Var10.getClass();
                Ey6iv0m0 = f40Var10.Ey6iv0m0("SELECT * FROM pairings WHERE rating > 0 ORDER BY openedAt DESC");
                try {
                    int sjUBp5pO31 = le0.sjUBp5pO(Ey6iv0m0, "id");
                    int sjUBp5pO32 = le0.sjUBp5pO(Ey6iv0m0, "name");
                    int sjUBp5pO33 = le0.sjUBp5pO(Ey6iv0m0, "emoji");
                    int sjUBp5pO34 = le0.sjUBp5pO(Ey6iv0m0, "subtitle");
                    int sjUBp5pO35 = le0.sjUBp5pO(Ey6iv0m0, "description");
                    int sjUBp5pO36 = le0.sjUBp5pO(Ey6iv0m0, "sauceBase");
                    int sjUBp5pO37 = le0.sjUBp5pO(Ey6iv0m0, "intensity");
                    int sjUBp5pO38 = le0.sjUBp5pO(Ey6iv0m0, "intensityLevel");
                    int sjUBp5pO39 = le0.sjUBp5pO(Ey6iv0m0, "prepMinutes");
                    int sjUBp5pO40 = le0.sjUBp5pO(Ey6iv0m0, "cuisine");
                    int sjUBp5pO41 = le0.sjUBp5pO(Ey6iv0m0, "scope");
                    int sjUBp5pO42 = le0.sjUBp5pO(Ey6iv0m0, "tags");
                    int sjUBp5pO43 = le0.sjUBp5pO(Ey6iv0m0, "contextNote");
                    int sjUBp5pO44 = le0.sjUBp5pO(Ey6iv0m0, "flow");
                    int sjUBp5pO45 = le0.sjUBp5pO(Ey6iv0m0, "popularity");
                    int sjUBp5pO46 = le0.sjUBp5pO(Ey6iv0m0, "novelty");
                    int sjUBp5pO47 = le0.sjUBp5pO(Ey6iv0m0, "openedAt");
                    int sjUBp5pO48 = le0.sjUBp5pO(Ey6iv0m0, "rating");
                    ArrayList arrayList3 = new ArrayList();
                    while (Ey6iv0m0.amk52bBQ()) {
                        int i9 = sjUBp5pO33;
                        int i10 = sjUBp5pO35;
                        int i11 = sjUBp5pO45;
                        int i12 = sjUBp5pO34;
                        int i13 = sjUBp5pO32;
                        int i14 = sjUBp5pO46;
                        int i15 = sjUBp5pO48;
                        arrayList3.add(new oy(Ey6iv0m0.getLong(sjUBp5pO31), Ey6iv0m0.wxUZMvaN(sjUBp5pO32), Ey6iv0m0.wxUZMvaN(sjUBp5pO33), Ey6iv0m0.wxUZMvaN(sjUBp5pO34), Ey6iv0m0.wxUZMvaN(sjUBp5pO35), Ey6iv0m0.wxUZMvaN(sjUBp5pO36), Ey6iv0m0.wxUZMvaN(sjUBp5pO37), (int) Ey6iv0m0.getLong(sjUBp5pO38), (int) Ey6iv0m0.getLong(sjUBp5pO39), Ey6iv0m0.wxUZMvaN(sjUBp5pO40), Ey6iv0m0.wxUZMvaN(sjUBp5pO41), Ey6iv0m0.wxUZMvaN(sjUBp5pO42), Ey6iv0m0.wxUZMvaN(sjUBp5pO43), Ey6iv0m0.wxUZMvaN(sjUBp5pO44), (int) Ey6iv0m0.getLong(i11), (int) Ey6iv0m0.getLong(i14), Ey6iv0m0.getLong(sjUBp5pO47), (int) Ey6iv0m0.getLong(i15)));
                        sjUBp5pO48 = i15;
                        sjUBp5pO46 = i14;
                        sjUBp5pO33 = i9;
                        sjUBp5pO35 = i10;
                        sjUBp5pO34 = i12;
                        sjUBp5pO32 = i13;
                        sjUBp5pO45 = i11;
                    }
                    return arrayList3;
                } finally {
                }
            case 26:
                f40 f40Var11 = (f40) obj;
                f40Var11.getClass();
                Ey6iv0m0 = f40Var11.Ey6iv0m0("SELECT * FROM pairings WHERE openedAt > 0 ORDER BY openedAt DESC LIMIT 1");
                try {
                    return Ey6iv0m0.amk52bBQ() ? new oy(Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "id")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "name")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "emoji")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "subtitle")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "description")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "sauceBase")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "intensity")), (int) Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "intensityLevel")), (int) Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "prepMinutes")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "cuisine")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "scope")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "tags")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "contextNote")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "flow")), (int) Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "popularity")), (int) Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "novelty")), Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "openedAt")), (int) Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "rating"))) : null;
                } finally {
                }
            case 27:
                ((oa) obj).getClass();
                throw new kw();
            case 28:
                return Boolean.valueOf(obj == null);
            default:
                f40 f40Var12 = (f40) obj;
                f40Var12.getClass();
                Ey6iv0m0 = f40Var12.Ey6iv0m0("SELECT * FROM sprint_rounds ORDER BY finishedAt DESC LIMIT ?");
                try {
                    Ey6iv0m0.qoPGr6Ce(1, 3L);
                    int sjUBp5pO49 = le0.sjUBp5pO(Ey6iv0m0, "id");
                    int sjUBp5pO50 = le0.sjUBp5pO(Ey6iv0m0, "traitKey");
                    int sjUBp5pO51 = le0.sjUBp5pO(Ey6iv0m0, "elapsedMillis");
                    int sjUBp5pO52 = le0.sjUBp5pO(Ey6iv0m0, "accuracyPercent");
                    int sjUBp5pO53 = le0.sjUBp5pO(Ey6iv0m0, "finishedAt");
                    int sjUBp5pO54 = le0.sjUBp5pO(Ey6iv0m0, "correctOrder");
                    int sjUBp5pO55 = le0.sjUBp5pO(Ey6iv0m0, "userOrder");
                    ArrayList arrayList4 = new ArrayList();
                    while (Ey6iv0m0.amk52bBQ()) {
                        arrayList4.add(new z80(Ey6iv0m0.getLong(sjUBp5pO49), Ey6iv0m0.wxUZMvaN(sjUBp5pO50), Ey6iv0m0.getLong(sjUBp5pO51), (int) Ey6iv0m0.getLong(sjUBp5pO52), Ey6iv0m0.getLong(sjUBp5pO53), Ey6iv0m0.wxUZMvaN(sjUBp5pO54), Ey6iv0m0.wxUZMvaN(sjUBp5pO55)));
                    }
                    return arrayList4;
                } finally {
                }
        }
    }

    public /* synthetic */ tKaxLBvG(int i) {
        this.NCTxEWno = i;
    }
}
