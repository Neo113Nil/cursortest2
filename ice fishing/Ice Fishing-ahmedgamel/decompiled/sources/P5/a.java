package P5;

import a6.InterfaceC0439a;
import b6.InterfaceC0520b;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public interface a {
    void addAlias(String str, String str2);

    void addAliases(Map<String, String> map);

    void addEmail(String str);

    void addObserver(InterfaceC0439a interfaceC0439a);

    void addSms(String str);

    void addTag(String str, String str2);

    void addTags(Map<String, String> map);

    String getExternalId();

    String getOnesignalId();

    InterfaceC0520b getPushSubscription();

    Map<String, String> getTags();

    void removeAlias(String str);

    void removeAliases(Collection<String> collection);

    void removeEmail(String str);

    void removeObserver(InterfaceC0439a interfaceC0439a);

    void removeSms(String str);

    void removeTag(String str);

    void removeTags(Collection<String> collection);

    void setLanguage(String str);

    void trackEvent(String str, Map<String, ? extends Object> map);
}
