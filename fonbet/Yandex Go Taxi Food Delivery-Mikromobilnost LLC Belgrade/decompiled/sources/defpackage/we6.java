package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.widget.ImageView;
import androidx.core.app.v;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import org.xmlpull.v1.XmlPullParserException;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public final class we6 implements pi, nl21, xyl0, og60, o671 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public we6(Context context, XmlResourceParser xmlResourceParser) {
        this.a = 13;
        this.b = -1;
        this.c = new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), z3i0.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == z3i0.StateSet_defaultState) {
                this.b = obtainStyledAttributes.getResourceId(index, this.b);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            u5u0 u5u0Var = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                u5u0Var = new u5u0(context, xmlResourceParser);
                                ((SparseArray) this.c).put(u5u0Var.a, u5u0Var);
                                break;
                            } else {
                                break;
                            }
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                v5u0 v5u0Var = new v5u0(context, xmlResourceParser);
                                if (u5u0Var != null) {
                                    u5u0Var.b.add(v5u0Var);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    @Override // defpackage.nl21
    public void B(o0k o0kVar) {
        ((zxd0) this.c).a.w.setImage(o0kVar.b, this.b);
    }

    @Override // defpackage.o671
    public String a() {
        Integer valueOf = Integer.valueOf(this.b);
        RectF rectF = (RectF) this.c;
        return String.format("exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", Arrays.copyOf(new Object[]{valueOf, rectF != null ? String.format("{x:%s,y:%s,width:%s,height:%s}", Arrays.copyOf(new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())}, 4)) : null}, 2));
    }

    @Override // defpackage.xyl0
    public void b() {
        RtspMediaSource$RtspPlaybackException rtspMediaSource$RtspPlaybackException = ((hjl0) this.c).E;
        if (rtspMediaSource$RtspPlaybackException != null) {
            throw rtspMediaSource$RtspPlaybackException;
        }
    }

    public void c(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, jr71.a(objArr.length, i));
        }
        ela1.b(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }

    public void d(String str) {
        int i = this.b;
        if (i > 1) {
            rwo rwoVar = (rwo) this.c;
            qv90.a.getClass();
            String concat = (("Был сделан повторный запрос в мобильный апи: количество попыток - " + i) + ", результат - " + str).concat(", request = check_payment_v2");
            wj00 wj00Var = new wj00(0);
            wj00Var.k("request", "check_payment_v2");
            wj00Var.j(i, "attempts");
            wj00Var.k(TarifficatorScenarioActivity.RESULT_KEY, str);
            wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
            ((y22) rwoVar).a(y891.c("retry_mobile_request", wj00Var));
        }
    }

    public int e(int i) {
        SparseArray sparseArray = (SparseArray) this.c;
        int i2 = 0;
        if (-1 == i) {
            u5u0 u5u0Var = i == -1 ? (u5u0) sparseArray.valueAt(0) : (u5u0) sparseArray.get(-1);
            if (u5u0Var != null) {
                ArrayList arrayList = u5u0Var.b;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((v5u0) arrayList.get(i2)).a(-1.0f, -1.0f)) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? u5u0Var.c : ((v5u0) arrayList.get(i2)).e;
                }
            }
        } else {
            u5u0 u5u0Var2 = (u5u0) sparseArray.get(i);
            if (u5u0Var2 != null) {
                ArrayList arrayList2 = u5u0Var2.b;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((v5u0) arrayList2.get(i2)).a(-1.0f, -1.0f)) {
                        break;
                    }
                    i2++;
                }
                return i2 == -1 ? u5u0Var2.c : ((v5u0) arrayList2.get(i2)).e;
            }
        }
        return -1;
    }

    @Override // defpackage.xyl0
    public boolean isReady() {
        hjl0 hjl0Var = (hjl0) this.c;
        int i = this.b;
        if (hjl0Var.J) {
            return false;
        }
        gjl0 gjl0Var = (gjl0) hjl0Var.x.get(i);
        return gjl0Var.c.t(gjl0Var.d);
    }

    @Override // defpackage.pi
    public boolean o(View view, hi hiVar) {
        switch (this.a) {
            case 0:
                ((BottomSheetBehavior) this.c).W(this.b);
                break;
            default:
                ((ModalViewBehavior) this.c).C(this.b);
                break;
        }
        return true;
    }

    @Override // defpackage.xyl0
    public int q(o7s o7sVar, nyg nygVar, int i) {
        hjl0 hjl0Var = (hjl0) this.c;
        int i2 = this.b;
        if (hjl0Var.J) {
            return -3;
        }
        gjl0 gjl0Var = (gjl0) hjl0Var.x.get(i2);
        return gjl0Var.c.y(o7sVar, nygVar, i, gjl0Var.d);
    }

    @Override // defpackage.xyl0
    public int r(long j) {
        hjl0 hjl0Var = (hjl0) this.c;
        int i = this.b;
        if (hjl0Var.J) {
            return -3;
        }
        gjl0 gjl0Var = (gjl0) hjl0Var.x.get(i);
        uyl0 uyl0Var = gjl0Var.c;
        int r = uyl0Var.r(j, gjl0Var.d);
        uyl0Var.D(r);
        return r;
    }

    @Override // defpackage.og60
    public Object a(v vVar, Continuation continuation) {
        Context context = (Context) this.c;
        Resources resources = context.getResources();
        int i = ewh0.notification_new_messages_count;
        int i2 = this.b;
        String quantityString = resources.getQuantityString(i, i2, new Integer(i2));
        vVar.f(context.getString(nyh0.messenger_notification_title_unapproved_chat));
        vVar.e(quantityString);
        return zy11.a;
    }

    public /* synthetic */ we6(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public we6() {
        this.a = 16;
        this.c = new Object[8];
        this.b = 0;
    }

    public we6(rwo rwoVar) {
        this.a = 6;
        this.c = rwoVar;
    }

    public /* synthetic */ we6(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    public we6(View view) {
        this.a = 3;
        this.c = (ImageView) view.findViewById(e9h0.message_edited_status);
        this.b = kjs0.b(14);
    }
}
