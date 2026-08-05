package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.PairShelfFragment;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class kx implements dl {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ kx(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0112, code lost:
    
        if (r4 == null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0119  */
    @Override // defpackage.dl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        Object obj3;
        hx hxVar;
        Object obj4;
        int i = this.NCTxEWno;
        Object obj5 = this.MdtA4re8;
        vn vnVar = null;
        switch (i) {
            case 0:
                PairShelfFragment pairShelfFragment = (PairShelfFragment) obj5;
                py pyVar = (py) obj;
                View view = (View) obj2;
                List list = PairShelfFragment.f7oeun2L;
                pyVar.getClass();
                view.getClass();
                PopupWindow popupWindow = pairShelfFragment.LvHlPNBd;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                LayoutInflater layoutInflater = pairShelfFragment.Xkz7p5xa;
                if (layoutInflater == null) {
                    layoutInflater = pairShelfFragment.U0LaHZX7(null);
                    pairShelfFragment.Xkz7p5xa = layoutInflater;
                }
                View inflate = layoutInflater.inflate(R.layout.popup_pair_preview, (ViewGroup) null, false);
                int i2 = R.id.preview_base_value;
                TextView textView = (TextView) n50.qoPGr6Ce(inflate, R.id.preview_base_value);
                if (textView != null) {
                    i2 = R.id.preview_cuisine_value;
                    TextView textView2 = (TextView) n50.qoPGr6Ce(inflate, R.id.preview_cuisine_value);
                    if (textView2 != null) {
                        i2 = R.id.preview_emoji;
                        TextView textView3 = (TextView) n50.qoPGr6Ce(inflate, R.id.preview_emoji);
                        if (textView3 != null) {
                            i2 = R.id.preview_intensity_value;
                            TextView textView4 = (TextView) n50.qoPGr6Ce(inflate, R.id.preview_intensity_value);
                            if (textView4 != null) {
                                i2 = R.id.preview_name;
                                TextView textView5 = (TextView) n50.qoPGr6Ce(inflate, R.id.preview_name);
                                if (textView5 != null) {
                                    i2 = R.id.preview_prep_value;
                                    TextView textView6 = (TextView) n50.qoPGr6Ce(inflate, R.id.preview_prep_value);
                                    if (textView6 != null) {
                                        textView3.setText(pyVar.MdtA4re8);
                                        textView5.setText(pyVar.NCTxEWno);
                                        textView.setText(pyVar.wxUZMvaN);
                                        textView4.setText(pyVar.VgvYg0wo);
                                        textView6.setText(pairShelfFragment.ygLcUYwZ(R.string.value_minutes, Integer.valueOf(pyVar.P7K7Inc8)));
                                        textView2.setText(pyVar.b2ZJblxo);
                                        PopupWindow popupWindow2 = new PopupWindow(inflate, -2, -2, true);
                                        popupWindow2.showAtLocation(view, 17, 0, 0);
                                        pairShelfFragment.LvHlPNBd = popupWindow2;
                                        return xe0.qoPGr6Ce;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            case 1:
                int intValue = ((Integer) obj).intValue();
                j9 j9Var = (j9) obj2;
                k9 key = j9Var.getKey();
                j9 OnDfzHZD = ((i40) obj5).P7K7Inc8.OnDfzHZD(key);
                if (key != re.VgvYg0wo) {
                    if (j9Var != OnDfzHZD) {
                        intValue = Integer.MIN_VALUE;
                    }
                    intValue++;
                } else {
                    vn vnVar2 = (vn) OnDfzHZD;
                    vn vnVar3 = (vn) j9Var;
                    while (vnVar3 != null) {
                        if (vnVar3 != vnVar2 && (vnVar3 instanceof v50)) {
                            y4 y4Var = (y4) b1.qoPGr6Ce.getObjectVolatile((v50) vnVar3, vn.NCTxEWno);
                            vnVar3 = y4Var != null ? y4Var.getParent() : null;
                        } else {
                            vnVar = vnVar3;
                            if (vnVar == vnVar2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + vnVar + ", expected child of " + vnVar2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (vnVar == vnVar2) {
                    }
                }
                return Integer.valueOf(intValue);
            default:
                List list2 = (List) obj5;
                CharSequence charSequence = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list2.size() == 1) {
                    int size = list2.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        m1.sjUBp5pO("List has more than one element.");
                        return null;
                    }
                    String str = (String) list2.get(0);
                    int FySoLYna = ba0.FySoLYna(charSequence, str, intValue2, 4);
                    if (FySoLYna >= 0) {
                        hxVar = new hx(Integer.valueOf(FySoLYna), str);
                        if (hxVar != null) {
                            return new hx(hxVar.NCTxEWno, Integer.valueOf(((String) hxVar.MdtA4re8).length()));
                        }
                        return null;
                    }
                    hxVar = null;
                    if (hxVar != null) {
                    }
                } else {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    boolean z = charSequence instanceof String;
                    int i3 = new en(intValue2, charSequence.length(), 1).MdtA4re8;
                    if (z) {
                        if (intValue2 <= i3) {
                            while (true) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (str2.regionMatches(0, (String) charSequence, intValue2, str2.length())) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    hxVar = new hx(Integer.valueOf(intValue2), str3);
                                } else if (intValue2 != i3) {
                                    intValue2++;
                                }
                            }
                        }
                        hxVar = null;
                        if (hxVar != null) {
                        }
                    } else {
                        if (intValue2 <= i3) {
                            while (true) {
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        if (ba0.lwWCatUu(str4, charSequence, intValue2, str4.length(), false)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    hxVar = new hx(Integer.valueOf(intValue2), str5);
                                } else if (intValue2 != i3) {
                                    intValue2++;
                                }
                            }
                            if (hxVar != null) {
                            }
                        }
                        hxVar = null;
                        if (hxVar != null) {
                        }
                    }
                }
        }
    }
}
