package com.onesignal.user.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import q7.v;
import r7.t;

/* loaded from: classes2.dex */
public class k implements L5.a, com.onesignal.common.modeling.g {
    private final P5.b _customEventController;
    private final Q5.b _identityModelStore;
    private final B4.a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final V5.b _subscriptionManager;
    private final com.onesignal.common.events.b changeHandlersNotifier;

    public static final class a extends kotlin.jvm.internal.i implements E7.l {
        final /* synthetic */ W5.c $newUserState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W5.c cVar) {
            super(1);
            this.$newUserState = cVar;
        }

        @Override // E7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((W5.a) null);
            return v.f40183a;
        }

        public final void invoke(W5.a it) {
            kotlin.jvm.internal.h.e(it, "it");
            new W5.b(this.$newUserState);
            it.a();
        }
    }

    public k(V5.b _subscriptionManager, Q5.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, P5.b _customEventController, B4.a _languageContext) {
        kotlin.jvm.internal.h.e(_subscriptionManager, "_subscriptionManager");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_propertiesModelStore, "_propertiesModelStore");
        kotlin.jvm.internal.h.e(_customEventController, "_customEventController");
        kotlin.jvm.internal.h.e(_languageContext, "_languageContext");
        this._subscriptionManager = _subscriptionManager;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._customEventController = _customEventController;
        this._languageContext = _languageContext;
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        _identityModelStore.subscribe((com.onesignal.common.modeling.g) this);
    }

    private final Q5.a get_identityModel() {
        return (Q5.a) this._identityModelStore.getModel();
    }

    private final com.onesignal.user.internal.properties.a get_propertiesModel() {
        return (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
    }

    @Override // L5.a
    public void addAlias(String label, String id) {
        kotlin.jvm.internal.h.e(label, "label");
        kotlin.jvm.internal.h.e(id, "id");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "setAlias(label: " + label + ", id: " + id + ')');
        if (label.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot add empty alias");
        } else if (label.equals("onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot add 'onesignal_id' alias");
        } else {
            get_identityModel().put((Q5.a) label, id);
        }
    }

    @Override // L5.a
    public void addAliases(Map<String, String> aliases) {
        kotlin.jvm.internal.h.e(aliases, "aliases");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "addAliases(aliases: " + aliases);
        for (Map.Entry<String, String> entry : aliases.entrySet()) {
            if (entry.getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot add empty alias");
                return;
            } else if (kotlin.jvm.internal.h.a(entry.getKey(), "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot add 'onesignal_id' alias");
                return;
            }
        }
        for (Map.Entry<String, String> entry2 : aliases.entrySet()) {
            get_identityModel().put((Q5.a) entry2.getKey(), entry2.getValue());
        }
    }

    @Override // L5.a
    public void addEmail(String email) {
        kotlin.jvm.internal.h.e(email, "email");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "addEmail(email: " + email + ')');
        if (com.onesignal.common.h.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.addEmailSubscription(email);
        } else {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot add invalid email address as subscription: ".concat(email));
        }
    }

    @Override // L5.a
    public void addObserver(W5.a observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    @Override // L5.a
    public void addSms(String sms) {
        kotlin.jvm.internal.h.e(sms, "sms");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "addSms(sms: " + sms + ')');
        if (com.onesignal.common.h.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.addSmsSubscription(sms);
        } else {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot add invalid sms number as subscription: ".concat(sms));
        }
    }

    @Override // L5.a
    public void addTag(String key, String value) {
        kotlin.jvm.internal.h.e(key, "key");
        kotlin.jvm.internal.h.e(value, "value");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "setTag(key: " + key + ", value: " + value + ')');
        if (key.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot add tag with empty key");
        } else {
            get_propertiesModel().getTags().put((com.onesignal.common.modeling.h) key, value);
        }
    }

    @Override // L5.a
    public void addTags(Map<String, String> tags) {
        kotlin.jvm.internal.h.e(tags, "tags");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "setTags(tags: " + tags + ')');
        Iterator<Map.Entry<String, String>> it = tags.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot add tag with empty key");
                return;
            }
        }
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            get_propertiesModel().getTags().put((com.onesignal.common.modeling.h) entry.getKey(), entry.getValue());
        }
    }

    public final Map<String, String> getAliases() {
        Q5.a aVar = get_identityModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : aVar.entrySet()) {
            if (!kotlin.jvm.internal.h.a(entry.getKey(), "id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return t.E(linkedHashMap);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // L5.a
    public String getExternalId() {
        String externalId = get_identityModel().getExternalId();
        return externalId == null ? "" : externalId;
    }

    @Override // L5.a
    public String getOnesignalId() {
        return com.onesignal.common.d.INSTANCE.isLocalId(get_identityModel().getOnesignalId()) ? "" : get_identityModel().getOnesignalId();
    }

    @Override // L5.a
    public X5.b getPushSubscription() {
        return this._subscriptionManager.getSubscriptions().getPush();
    }

    public final V5.c getSubscriptions() {
        return this._subscriptionManager.getSubscriptions();
    }

    @Override // L5.a
    public Map<String, String> getTags() {
        return t.E(get_propertiesModel().getTags());
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(Q5.a model, String tag) {
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(tag, "tag");
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        kotlin.jvm.internal.h.e(args, "args");
        kotlin.jvm.internal.h.e(tag, "tag");
        if (kotlin.jvm.internal.h.a(args.getProperty(), "onesignal_id")) {
            this.changeHandlersNotifier.fire(new a(new W5.c(String.valueOf(args.getNewValue()), getExternalId())));
        }
    }

    @Override // L5.a
    public void removeAlias(String label) {
        kotlin.jvm.internal.h.e(label, "label");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "removeAlias(label: " + label + ')');
        if (label.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot remove empty alias");
        } else if (label.equals("onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot remove 'onesignal_id' alias");
        } else {
            get_identityModel().remove((Object) label);
        }
    }

    @Override // L5.a
    public void removeAliases(Collection<String> labels) {
        kotlin.jvm.internal.h.e(labels, "labels");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "removeAliases(labels: " + labels + ')');
        for (String str : labels) {
            if (str.length() == 0) {
                com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot remove empty alias");
                return;
            } else if (kotlin.jvm.internal.h.a(str, "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot remove 'onesignal_id' alias");
                return;
            }
        }
        Iterator<T> it = labels.iterator();
        while (it.hasNext()) {
            get_identityModel().remove(it.next());
        }
    }

    @Override // L5.a
    public void removeEmail(String email) {
        kotlin.jvm.internal.h.e(email, "email");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "removeEmail(email: " + email + ')');
        if (com.onesignal.common.h.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.removeEmailSubscription(email);
        } else {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot remove invalid email address as subscription: ".concat(email));
        }
    }

    @Override // L5.a
    public void removeObserver(W5.a observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }

    @Override // L5.a
    public void removeSms(String sms) {
        kotlin.jvm.internal.h.e(sms, "sms");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "removeSms(sms: " + sms + ')');
        if (com.onesignal.common.h.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.removeSmsSubscription(sms);
        } else {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot remove invalid sms number as subscription: ".concat(sms));
        }
    }

    @Override // L5.a
    public void removeTag(String key) {
        kotlin.jvm.internal.h.e(key, "key");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "removeTag(key: " + key + ')');
        if (key.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot remove tag with empty key");
        } else {
            get_propertiesModel().getTags().remove((Object) key);
        }
    }

    @Override // L5.a
    public void removeTags(Collection<String> keys) {
        kotlin.jvm.internal.h.e(keys, "keys");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "removeTags(keys: " + keys + ')');
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() == 0) {
                com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Cannot remove tag with empty key");
                return;
            }
        }
        Iterator<T> it2 = keys.iterator();
        while (it2.hasNext()) {
            get_propertiesModel().getTags().remove(it2.next());
        }
    }

    @Override // L5.a
    public void setLanguage(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this._languageContext.setLanguage(value);
    }

    @Override // L5.a
    public void trackEvent(String name, Map<String, ? extends Object> map) {
        kotlin.jvm.internal.h.e(name, "name");
        if (com.onesignal.common.f.INSTANCE.isValidJsonObject(map)) {
            this._customEventController.sendCustomEvent(name, map);
        } else {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "Custom event properties are not JSON-serializable");
        }
    }
}
