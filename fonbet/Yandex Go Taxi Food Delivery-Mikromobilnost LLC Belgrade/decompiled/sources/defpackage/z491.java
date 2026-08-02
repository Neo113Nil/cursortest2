package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class z491 {
    static {
        u591.a().getClass();
    }

    public static void a(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                new StringBuilder(String.valueOf(e).length() + 24);
            }
        }
    }

    public final void b(Object obj, String str) {
        synchronized (z491.class) {
            throw null;
        }
    }

    public final void c(Intent intent) {
        String str;
        if (intent == null) {
            Log.isLoggable("InstanceID", 3);
            return;
        }
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action) && !"com.google.android.gms.iid.InstanceID".equals(action)) {
            if (Log.isLoggable("InstanceID", 3)) {
                intent.getAction();
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (!matcher.matches()) {
                Log.isLoggable("InstanceID", 3);
                return;
            }
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            Bundle extras = intent.getExtras();
            extras.putString("registration_id", group2);
            b(extras, group);
            return;
        }
        String stringExtra2 = intent.getStringExtra("error");
        if (stringExtra2 == null) {
            new StringBuilder(String.valueOf(intent.getExtras()).length() + 49);
            return;
        }
        Log.isLoggable("InstanceID", 3);
        if (stringExtra2.startsWith("|")) {
            String[] split = stringExtra2.split("\\|");
            String str2 = split[1];
            if (split.length > 2) {
                str = split[2];
                String str3 = split[3];
                if (str3.startsWith(":")) {
                    str3 = str3.substring(1);
                }
                stringExtra2 = str3;
            } else {
                stringExtra2 = "UNKNOWN";
                str = null;
            }
            intent.putExtra("error", stringExtra2);
        } else {
            str = null;
        }
        if (str != null) {
            b(stringExtra2, str);
        } else {
            synchronized (z491.class) {
                throw null;
            }
        }
    }
}
