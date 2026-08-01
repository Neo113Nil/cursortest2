package h1;

import D1.i;
import K1.d;
import Z.AbstractComponentCallbacksC0070s;
import Z0.n;
import a1.C0083a;
import a1.r;
import android.text.Editable;
import android.text.TextWatcher;
import com.lumenpath.harispro.hrnavigator.ui.dictionary.DictionaryFragment;
import com.lumenpath.harispro.hrnavigator.ui.knowledge.KnowledgeFragment;
import e1.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173a implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0070s f3269b;

    public /* synthetic */ C0173a(int i, AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        this.f3268a = i;
        this.f3269b = abstractComponentCallbacksC0070s;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        List<r> list;
        List<C0083a> list2;
        switch (this.f3268a) {
            case 0:
                String lowerCase = d.q0(String.valueOf(editable)).toString().toLowerCase(Locale.ROOT);
                i.d(lowerCase, "toLowerCase(...)");
                if (lowerCase.length() == 0) {
                    list = n.f1653a;
                } else {
                    List list3 = n.f1653a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list3) {
                        r rVar = (r) obj;
                        String str = rVar.f1735b;
                        Locale locale = Locale.ROOT;
                        String lowerCase2 = str.toLowerCase(locale);
                        i.d(lowerCase2, "toLowerCase(...)");
                        if (!d.g0(lowerCase2, lowerCase)) {
                            String lowerCase3 = rVar.f1736c.toLowerCase(locale);
                            i.d(lowerCase3, "toLowerCase(...)");
                            if (d.g0(lowerCase3, lowerCase)) {
                            }
                        }
                        arrayList.add(obj);
                    }
                    list = arrayList;
                }
                DictionaryFragment dictionaryFragment = (DictionaryFragment) this.f3269b;
                dictionaryFragment.f2799X = list;
                e1.d dVar = dictionaryFragment.f2800Y;
                if (dVar == null) {
                    i.i("adapter");
                    throw null;
                }
                ArrayList arrayList2 = new ArrayList(u1.i.I(list, 10));
                for (r rVar2 : list) {
                    arrayList2.add(new f("📖", rVar2.f1735b, rVar2.f1736c));
                }
                dVar.f2843f = arrayList2;
                dVar.f3370a.b();
                return;
            default:
                String lowerCase4 = d.q0(String.valueOf(editable)).toString().toLowerCase(Locale.ROOT);
                i.d(lowerCase4, "toLowerCase(...)");
                if (lowerCase4.length() == 0) {
                    list2 = Z0.a.f1640a;
                } else {
                    List list4 = Z0.a.f1640a;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list4) {
                        C0083a c0083a = (C0083a) obj2;
                        String str2 = c0083a.f1670c;
                        Locale locale2 = Locale.ROOT;
                        String lowerCase5 = str2.toLowerCase(locale2);
                        i.d(lowerCase5, "toLowerCase(...)");
                        if (!d.g0(lowerCase5, lowerCase4)) {
                            String lowerCase6 = c0083a.f1671d.toLowerCase(locale2);
                            i.d(lowerCase6, "toLowerCase(...)");
                            if (d.g0(lowerCase6, lowerCase4)) {
                            }
                        }
                        arrayList3.add(obj2);
                    }
                    list2 = arrayList3;
                }
                KnowledgeFragment knowledgeFragment = (KnowledgeFragment) this.f3269b;
                knowledgeFragment.f2806X = list2;
                e1.d dVar2 = knowledgeFragment.f2807Y;
                if (dVar2 == null) {
                    i.i("adapter");
                    throw null;
                }
                ArrayList arrayList4 = new ArrayList(u1.i.I(list2, 10));
                for (C0083a c0083a2 : list2) {
                    arrayList4.add(new f(c0083a2.f1669b, c0083a2.f1670c, c0083a2.f1671d));
                }
                dVar2.f2843f = arrayList4;
                dVar2.f3370a.b();
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f3268a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f3268a;
    }
}
