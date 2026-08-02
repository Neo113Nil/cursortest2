package defpackage;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.app.x;
import androidx.core.app.z0;
import androidx.core.graphics.drawable.IconCompat;
import com.connectsdk.service.airplay.PListParser;

/* loaded from: classes.dex */
public final class odq {
    public Context a;
    public String b;
    public Intent[] c;
    public String d;
    public IconCompat e;
    public z0[] f;
    public PersistableBundle g;

    public final ShortcutInfo a() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.d).setIntents(this.c);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.h(this.a));
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setLongLabel(null);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        intents.setRank(0);
        PersistableBundle persistableBundle = this.g;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            z0[] z0VarArr = this.f;
            if (z0VarArr != null && z0VarArr.length > 0) {
                int length = z0VarArr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    z0 z0Var = this.f[i];
                    z0Var.getClass();
                    personArr[i] = x.f(z0Var);
                }
                intents.setPersons(personArr);
            }
            intents.setLongLived(true);
        } else {
            if (this.g == null) {
                this.g = new PersistableBundle();
            }
            z0[] z0VarArr2 = this.f;
            if (z0VarArr2 != null && z0VarArr2.length > 0) {
                this.g.putInt("extraPersonCount", z0VarArr2.length);
                int i2 = 0;
                while (i2 < this.f.length) {
                    PersistableBundle persistableBundle2 = this.g;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    String sb2 = sb.toString();
                    z0 z0Var2 = this.f[i2];
                    z0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = z0Var2.a;
                    persistableBundle3.putString("name", charSequence != null ? charSequence.toString() : null);
                    persistableBundle3.putString("uri", null);
                    persistableBundle3.putString(PListParser.TAG_KEY, null);
                    persistableBundle3.putBoolean("isBot", false);
                    persistableBundle3.putBoolean("isImportant", false);
                    persistableBundle2.putPersistableBundle(sb2, persistableBundle3);
                    i2 = i3;
                }
            }
            this.g.putBoolean("extraLongLived", true);
            intents.setExtras(this.g);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            rb.L(intents);
        }
        return intents.build();
    }
}
