package com.onesignal.user.internal;

import ac.o;
import bc.z;
import com.onesignal.common.i;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class f implements fb.a, g {
    private final jb.b _identityModelStore;
    private final x8.a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final ob.b _subscriptionManager;
    private final com.onesignal.common.events.b changeHandlersNotifier;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements oc.c {
        final /* synthetic */ pb.c $newUserState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pb.c cVar) {
            super(1);
            this.$newUserState = cVar;
        }

        @Override // oc.c
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((pb.a) null);
            return o.f277a;
        }

        public final void invoke(pb.a aVar) {
            j.e(aVar, "it");
            new pb.b(this.$newUserState);
            aVar.a();
        }
    }

    public f(ob.b bVar, jb.b bVar2, com.onesignal.user.internal.properties.b bVar3, x8.a aVar) {
        j.e(bVar, "_subscriptionManager");
        j.e(bVar2, "_identityModelStore");
        j.e(bVar3, "_propertiesModelStore");
        j.e(aVar, "_languageContext");
        this._subscriptionManager = bVar;
        this._identityModelStore = bVar2;
        this._propertiesModelStore = bVar3;
        this._languageContext = aVar;
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        bVar2.subscribe((g) this);
    }

    private final jb.a get_identityModel() {
        return (jb.a) this._identityModelStore.getModel();
    }

    private final com.onesignal.user.internal.properties.a get_propertiesModel() {
        return (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
    }

    @Override // fb.a
    public void addAlias(String str, String str2) {
        j.e(str, "label");
        j.e(str2, "id");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "setAlias(label: " + str + ", id: " + str2 + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot add empty alias");
        } else if (str.equals("onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot add 'onesignal_id' alias");
        } else {
            get_identityModel().put((jb.a) str, str2);
        }
    }

    @Override // fb.a
    public void addAliases(Map<String, String> map) {
        j.e(map, "aliases");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "addAliases(aliases: " + map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot add empty alias");
                return;
            } else if (j.a(entry.getKey(), "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot add 'onesignal_id' alias");
                return;
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            get_identityModel().put((jb.a) entry2.getKey(), entry2.getValue());
        }
    }

    @Override // fb.a
    public void addEmail(String str) {
        j.e(str, "email");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "addEmail(email: " + str + ')');
        if (i.INSTANCE.isValidEmail(str)) {
            this._subscriptionManager.addEmailSubscription(str);
        } else {
            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot add invalid email address as subscription: ".concat(str));
        }
    }

    @Override // fb.a
    public void addObserver(pb.a aVar) {
        j.e(aVar, "observer");
        this.changeHandlersNotifier.subscribe(aVar);
    }

    @Override // fb.a
    public void addSms(String str) {
        j.e(str, "sms");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "addSms(sms: " + str + ')');
        if (i.INSTANCE.isValidPhoneNumber(str)) {
            this._subscriptionManager.addSmsSubscription(str);
        } else {
            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot add invalid sms number as subscription: ".concat(str));
        }
    }

    @Override // fb.a
    public void addTag(String str, String str2) {
        j.e(str, "key");
        j.e(str2, "value");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "setTag(key: " + str + ", value: " + str2 + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot add tag with empty key");
        } else {
            get_propertiesModel().getTags().put((h) str, str2);
        }
    }

    @Override // fb.a
    public void addTags(Map<String, String> map) {
        j.e(map, "tags");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "setTags(tags: " + map + ')');
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot add tag with empty key");
                return;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            get_propertiesModel().getTags().put((h) entry.getKey(), entry.getValue());
        }
    }

    public final Map<String, String> getAliases() {
        jb.a aVar = get_identityModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : aVar.entrySet()) {
            if (!j.a(entry.getKey(), "id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return z.R(linkedHashMap);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // fb.a
    public String getExternalId() {
        String externalId = get_identityModel().getExternalId();
        return externalId == null ? "" : externalId;
    }

    @Override // fb.a
    public String getOnesignalId() {
        return com.onesignal.common.e.INSTANCE.isLocalId(get_identityModel().getOnesignalId()) ? "" : get_identityModel().getOnesignalId();
    }

    @Override // fb.a
    public qb.b getPushSubscription() {
        return this._subscriptionManager.getSubscriptions().getPush();
    }

    public final ob.c getSubscriptions() {
        return this._subscriptionManager.getSubscriptions();
    }

    @Override // fb.a
    public Map<String, String> getTags() {
        return z.R(get_propertiesModel().getTags());
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(jb.a aVar, String str) {
        j.e(aVar, "model");
        j.e(str, "tag");
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
        j.e(jVar, "args");
        j.e(str, "tag");
        if (j.a(jVar.getProperty(), "onesignal_id")) {
            this.changeHandlersNotifier.fire(new a(new pb.c(String.valueOf(jVar.getNewValue()), getExternalId())));
        }
    }

    @Override // fb.a
    public void removeAlias(String str) {
        j.e(str, "label");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "removeAlias(label: " + str + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot remove empty alias");
        } else if (str.equals("onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot remove 'onesignal_id' alias");
        } else {
            get_identityModel().remove((Object) str);
        }
    }

    @Override // fb.a
    public void removeAliases(Collection<String> collection) {
        j.e(collection, "labels");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "removeAliases(labels: " + collection + ')');
        Collection<String> collection2 = collection;
        for (String str : collection2) {
            if (str.length() == 0) {
                com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot remove empty alias");
                return;
            } else if (j.a(str, "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot remove 'onesignal_id' alias");
                return;
            }
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            get_identityModel().remove(it.next());
        }
    }

    @Override // fb.a
    public void removeEmail(String str) {
        j.e(str, "email");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "removeEmail(email: " + str + ')');
        if (i.INSTANCE.isValidEmail(str)) {
            this._subscriptionManager.removeEmailSubscription(str);
        } else {
            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot remove invalid email address as subscription: ".concat(str));
        }
    }

    @Override // fb.a
    public void removeObserver(pb.a aVar) {
        j.e(aVar, "observer");
        this.changeHandlersNotifier.unsubscribe(aVar);
    }

    @Override // fb.a
    public void removeSms(String str) {
        j.e(str, "sms");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "removeSms(sms: " + str + ')');
        if (i.INSTANCE.isValidPhoneNumber(str)) {
            this._subscriptionManager.removeSmsSubscription(str);
        } else {
            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot remove invalid sms number as subscription: ".concat(str));
        }
    }

    @Override // fb.a
    public void removeTag(String str) {
        j.e(str, "key");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "removeTag(key: " + str + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot remove tag with empty key");
        } else {
            get_propertiesModel().getTags().remove((Object) str);
        }
    }

    @Override // fb.a
    public void removeTags(Collection<String> collection) {
        j.e(collection, "keys");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "removeTags(keys: " + collection + ')');
        Collection<String> collection2 = collection;
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() == 0) {
                com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Cannot remove tag with empty key");
                return;
            }
        }
        Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            get_propertiesModel().getTags().remove(it2.next());
        }
    }

    @Override // fb.a
    public void setLanguage(String str) {
        j.e(str, "value");
        this._languageContext.setLanguage(str);
    }
}
