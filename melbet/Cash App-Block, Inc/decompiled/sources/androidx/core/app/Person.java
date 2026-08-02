package androidx.core.app;

import android.app.Person;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class Person {
    public boolean mIsBot;
    public boolean mIsImportant;
    public String mKey;
    public CharSequence mName;
    public String mUri;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String str = this.mKey;
        String str2 = person.mKey;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.mName), Objects.toString(person.mName)) && Objects.equals(this.mUri, person.mUri) && Boolean.valueOf(this.mIsBot).equals(Boolean.valueOf(person.mIsBot)) && Boolean.valueOf(this.mIsImportant).equals(Boolean.valueOf(person.mIsImportant)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.mKey;
        return str != null ? str.hashCode() : Objects.hash(this.mName, this.mUri, Boolean.valueOf(this.mIsBot), Boolean.valueOf(this.mIsImportant));
    }

    public final android.app.Person toAndroidPerson() {
        return new Person.Builder().setName(this.mName).setIcon(null).setUri(this.mUri).setKey(this.mKey).setBot(this.mIsBot).setImportant(this.mIsImportant).build();
    }
}
