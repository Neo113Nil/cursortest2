package ru.kinopoisk.navigation.screen;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.li;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ru/kinopoisk/navigation/screen/SystemScreens$DevPanelLogSystemShare", "Lli;", "android_utils_navigation_mobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class SystemScreens$DevPanelLogSystemShare implements li {
    @Override // defpackage.li
    public final Intent b(t tVar) {
        tVar.getClass();
        Uri parse = Uri.parse(null);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "Logs");
        intent.putExtra("android.intent.extra.TEXT", "Logs attached");
        intent.putExtra("android.intent.extra.STREAM", parse);
        intent.setFlags(1);
        intent.setClipData(ClipData.newRawUri(null, parse));
        Intent createChooser = Intent.createChooser(intent, tVar.getString(0));
        createChooser.getClass();
        return createChooser;
    }
}
