package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class AndroidUriHandler implements UriHandler {
    public final Context context;

    public AndroidUriHandler(Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.platform.UriHandler
    public final void openUri(String str) {
        try {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            Handlers$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m('.', "Can't open ", str), e);
        }
    }
}
