package androidx.core.app;

import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteAction;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.database.CursorWindow;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.drawable.Icon;
import android.telephony.SubscriptionManager;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class Person$$ExternalSyntheticApiModelOutline1 {
    public static /* synthetic */ Person.Builder m() {
        return new Person.Builder();
    }

    public static /* synthetic */ RemoteAction m(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
    }

    public static /* synthetic */ ShortcutInfo.Builder m(Context context, String str) {
        return new ShortcutInfo.Builder(context, str);
    }

    public static /* bridge */ /* synthetic */ ShortcutInfo m(Object obj) {
        return (ShortcutInfo) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ShortcutManager m25m(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* synthetic */ CursorWindow m(String str, long j) {
        return new CursorWindow(str, j);
    }

    public static /* synthetic */ BlendModeColorFilter m(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m35m() {
        return SubscriptionManager.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m41m() {
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m49m$1() {
        return ShortcutManager.class;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m50m$1() {
    }
}
