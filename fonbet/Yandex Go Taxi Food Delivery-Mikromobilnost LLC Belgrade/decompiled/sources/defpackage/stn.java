package defpackage;

import androidx.emoji2.emojipicker.EmojiPickerView;
import androidx.emoji2.emojipicker.a;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class stn implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ vtn b;

    public /* synthetic */ stn(vtn vtnVar, int i) {
        this.a = i;
        this.b = vtnVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ztn createEmojiPickerBodyAdapter$lambda$3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        vtn vtnVar = this.b;
        switch (i) {
            case 0:
                vtnVar.y.invoke(vtnVar, (tun) obj2);
                return zy11Var;
            default:
                String str = (String) obj2;
                LinkedHashMap linkedHashMap = a.c;
                if (linkedHashMap != null) {
                    String str2 = (String) ((List) linkedHashMap.get(str)).get(0);
                    createEmojiPickerBodyAdapter$lambda$3 = EmojiPickerView.createEmojiPickerBodyAdapter$lambda$3((EmojiPickerView) vtnVar.x.b);
                    int i2 = 0;
                    for (Object obj3 : createEmojiPickerBodyAdapter$lambda$3) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        g3x g3xVar = (g3x) obj3;
                        if (g3xVar instanceof qun) {
                            LinkedHashMap linkedHashMap2 = a.c;
                            if (linkedHashMap2 != null) {
                                qun qunVar = (qun) g3xVar;
                                List list = (List) linkedHashMap2.get(qunVar.c);
                                if (jl40.l(list != null ? (String) list.get(0) : null, str2) && qunVar.d) {
                                    qunVar.c = str;
                                    vtnVar.notifyItemChanged(i2);
                                }
                            } else {
                                ny61.r("BundledEmojiListLoader.load is not called or complete");
                            }
                        }
                        i2 = i3;
                    }
                    return zy11Var;
                }
                ny61.r("BundledEmojiListLoader.load is not called or complete");
                return null;
        }
    }
}
