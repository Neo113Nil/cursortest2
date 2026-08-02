package defpackage;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.suggest.AdditionalSuggest;
import defpackage.hl0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.persuggest.api.ActionButtonSize;
import ru.yandex.taxi.persuggest.api.ActionType;
import ru.yandex.taxi.persuggest.api.AdditionalButtonStyle;
import ru.yandex.taxi.persuggest.domain.model.SuggestResult$SuggestAction;

/* loaded from: classes6.dex */
public final class w9v0 {
    public kdc A;
    public String B;
    public String C;
    public hl0 D;
    public yn0 E;
    public String F;
    public SuggestResult$SuggestAction G;
    public String H;
    public List I;
    public s6u0 J;
    public FormattedText K;
    public FormattedText L;
    public ga0 M;
    public final int a;
    public String b;
    public FormattedText c;
    public FormattedText d;
    public FormattedText e;
    public CharSequence f;
    public FormattedText g;
    public String h;
    public String i;
    public String j;
    public ArrayList k;
    public ArrayList l;
    public String o;
    public boolean s;
    public String u;
    public Address v;
    public Integer y;
    public kdc z;
    public boolean m = true;
    public int n = x9v0.P;
    public kne0 p = new kne0("", false);
    public String q = "";
    public List r = EmptyList.a;
    public boolean t = true;
    public yzb w = yzb.b;
    public o8v0 x = n8v0.a;

    public w9v0(int i) {
        this.a = i;
    }

    public final void a(AdditionalSuggest additionalSuggest, pdc pdcVar, k7x0 k7x0Var) {
        Uri uri;
        this.y = additionalSuggest.getGroupId();
        this.x = n8v0.a;
        this.B = additionalSuggest.getId();
        this.t = false;
        uk0 action = additionalSuggest.getAction();
        ActionType actionType = null;
        r2 = null;
        Uri uri2 = null;
        if (action != null) {
            String str = action.b;
            this.E = new yn0(action.a, (str == null || str.length() == 0) ? null : Uri.parse(str));
        }
        al0 leadBody = additionalSuggest.getLeadBody();
        if (leadBody != null) {
            this.c = leadBody.a;
            FormattedText formattedText = leadBody.b;
            if (formattedText != null) {
                this.g = formattedText;
            }
        }
        al0 trailBody = additionalSuggest.getTrailBody();
        if (trailBody != null) {
            this.d = trailBody.a;
            this.e = trailBody.b;
        }
        ql0 lead = additionalSuggest.getLead();
        if (lead != null) {
            String str2 = lead.a;
            this.i = (str2 == null || str2.length() == 0) ? null : ((m7x0) k7x0Var).a(str2);
            this.z = ((ufu) pdcVar).g(lead.b);
        }
        ql0 trail = additionalSuggest.getTrail();
        if (trail != null) {
            String str3 = trail.a;
            this.j = (str3 == null || str3.length() == 0) ? null : ((m7x0) k7x0Var).a(str3);
            this.A = ((ufu) pdcVar).g(trail.b);
        }
        dl0 trailButton = additionalSuggest.getTrailButton();
        if (trailButton != null) {
            uk0 uk0Var = trailButton.d;
            if (uk0Var != null) {
                String str4 = uk0Var.b;
                if (str4 != null && str4.length() != 0) {
                    uri2 = Uri.parse(str4);
                }
                Uri uri3 = uri2;
                actionType = uk0Var.a;
                uri = uri3;
            } else {
                uri = null;
            }
            hl0.a aVar = new hl0.a();
            aVar.a = trailButton.a;
            ActionButtonSize actionButtonSize = trailButton.c;
            int i = 0;
            int i2 = actionButtonSize == null ? -1 : gl0.a[actionButtonSize.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = 1;
                } else if (i2 == 3) {
                    i = 2;
                } else if (i2 == 4) {
                    i = 3;
                }
            }
            aVar.b = i;
            AdditionalButtonStyle additionalButtonStyle = trailButton.b;
            this.D = new hl0(aVar.a, (additionalButtonStyle != null ? gl0.b[additionalButtonStyle.ordinal()] : -1) == 1 ? Integer.valueOf(xng0.controlMain) : Integer.valueOf(xng0.controlMinor), aVar.b, new yn0(actionType, uri));
        }
        xk0 analytics = additionalSuggest.getAnalytics();
        if (analytics != null) {
            this.C = analytics.a;
        }
    }
}
