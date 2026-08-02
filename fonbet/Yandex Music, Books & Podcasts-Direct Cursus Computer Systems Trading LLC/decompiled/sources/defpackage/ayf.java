package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class ayf extends URLSpan {
    public final /* synthetic */ eyf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayf(eyf eyfVar, String str) {
        super(str);
        this.a = eyfVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        eyf eyfVar = this.a;
        view.getClass();
        try {
            eyfVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getURL())).putExtra("com.android.browser.application_id", eyfVar.requireActivity().getApplicationContext().getPackageName()));
        } catch (ActivityNotFoundException e) {
            LinkedHashMap linkedHashMap = sqg.a;
            uwf.l("Couldn't handle license Link activity: " + e + " for url: " + getURL());
        }
    }
}
