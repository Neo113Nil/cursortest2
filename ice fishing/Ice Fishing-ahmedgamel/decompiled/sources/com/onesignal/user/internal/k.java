package com.onesignal.user.internal;

import a6.C0440b;
import a6.C0441c;
import a6.InterfaceC0439a;
import b6.InterfaceC0520b;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import u7.v;
import v7.t;

/* loaded from: classes2.dex */
public class k implements P5.a, com.onesignal.common.modeling.g {
    private final T5.b _customEventController;
    private final U5.b _identityModelStore;
    private final F4.a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final Z5.b _subscriptionManager;
    private final com.onesignal.common.events.b changeHandlersNotifier;

    public static final class a extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ C0441c $newUserState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0441c c0441c) {
            super(1);
            this.$newUserState = c0441c;
        }

        @Override // I7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((InterfaceC0439a) null);
            return v.f41353a;
        }

        public final void invoke(InterfaceC0439a it) {
            kotlin.jvm.internal.h.e(it, "it");
            new C0440b(this.$newUserState);
            it.a();
        }
    }

    public k(Z5.b _subscriptionManager, U5.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, T5.b _customEventController, F4.a _languageContext) {
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

    private final U5.a get_identityModel() {
        return (U5.a) this._identityModelStore.getModel();
    }

    private final com.onesignal.user.internal.properties.a get_propertiesModel() {
        return (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
    }

    @Override // P5.a
    public void addAlias(String label, String id) {
        kotlin.jvm.internal.h.e(label, "label");
        kotlin.jvm.internal.h.e(id, "id");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "setAlias(label: " + label + ", id: " + id + ')');
        if (label.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot add empty alias");
        } else if (label.equals("onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot add 'onesignal_id' alias");
        } else {
            get_identityModel().put((U5.a) label, id);
        }
    }

    @Override // P5.a
    public void addAliases(Map<String, String> aliases) {
        kotlin.jvm.internal.h.e(aliases, "aliases");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "addAliases(aliases: " + aliases);
        for (Map.Entry<String, String> entry : aliases.entrySet()) {
            if (entry.getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot add empty alias");
                return;
            } else if (kotlin.jvm.internal.h.a(entry.getKey(), "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot add 'onesignal_id' alias");
                return;
            }
        }
        for (Map.Entry<String, String> entry2 : aliases.entrySet()) {
            get_identityModel().put((U5.a) entry2.getKey(), entry2.getValue());
        }
    }

    @Override // P5.a
    public void addEmail(String email) {
        kotlin.jvm.internal.h.e(email, "email");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "addEmail(email: " + email + ')');
        if (com.onesignal.common.h.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.addEmailSubscription(email);
        } else {
            com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot add invalid email address as subscription: ".concat(email));
        }
    }

    @Override // P5.a
    public void addObserver(InterfaceC0439a observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    @Override // P5.a
    public void addSms(String sms) {
        kotlin.jvm.internal.h.e(sms, "sms");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "addSms(sms: " + sms + ')');
        if (com.onesignal.common.h.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.addSmsSubscription(sms);
        } else {
            com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot add invalid sms number as subscription: ".concat(sms));
        }
    }

    @Override // P5.a
    public void addTag(String key, String value) {
        kotlin.jvm.internal.h.e(key, "key");
        kotlin.jvm.internal.h.e(value, "value");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "setTag(key: " + key + ", value: " + value + ')');
        if (key.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot add tag with empty key");
        } else {
            get_propertiesModel().getTags().put((com.onesignal.common.modeling.h) key, value);
        }
    }

    @Override // P5.a
    public void addTags(Map<String, String> tags) {
        kotlin.jvm.internal.h.e(tags, "tags");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "setTags(tags: " + tags + ')');
        Iterator<Map.Entry<String, String>> it = tags.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot add tag with empty key");
                return;
            }
        }
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            get_propertiesModel().getTags().put((com.onesignal.common.modeling.h) entry.getKey(), entry.getValue());
        }
    }

    public final Map<String, String> getAliases() {
        U5.a aVar = get_identityModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : aVar.entrySet()) {
            if (!kotlin.jvm.internal.h.a(entry.getKey(), "id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return t.U(linkedHashMap);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // P5.a
    public String getExternalId() {
        String externalId = get_identityModel().getExternalId();
        return externalId == null ? "" : externalId;
    }

    @Override // P5.a
    public String getOnesignalId() {
        return com.onesignal.common.d.INSTANCE.isLocalId(get_identityModel().getOnesignalId()) ? "" : get_identityModel().getOnesignalId();
    }

    @Override // P5.a
    public InterfaceC0520b getPushSubscription() {
        return this._subscriptionManager.getSubscriptions().getPush();
    }

    public final Z5.c getSubscriptions() {
        return this._subscriptionManager.getSubscriptions();
    }

    @Override // P5.a
    public Map<String, String> getTags() {
        return t.U(get_propertiesModel().getTags());
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(U5.a model, String tag) {
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(tag, "tag");
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        kotlin.jvm.internal.h.e(args, "args");
        kotlin.jvm.internal.h.e(tag, "tag");
        if (kotlin.jvm.internal.h.a(args.getProperty(), "onesignal_id")) {
            this.changeHandlersNotifier.fire(new a(new C0441c(String.valueOf(args.getNewValue()), getExternalId())));
        }
    }

    @Override // P5.a
    public void removeAlias(String label) {
        kotlin.jvm.internal.h.e(label, "label");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "removeAlias(label: " + label + ')');
        if (label.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot remove empty alias");
        } else if (label.equals("onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot remove 'onesignal_id' alias");
        } else {
            get_identityModel().remove((Object) label);
        }
    }

    @Override // P5.a
    public void removeAliases(Collection<String> labels) {
        kotlin.jvm.internal.h.e(labels, "labels");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "removeAliases(labels: " + labels + ')');
        for (String str : labels) {
            if (str.length() == 0) {
                com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot remove empty alias");
                return;
            } else if (kotlin.jvm.internal.h.a(str, "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot remove 'onesignal_id' alias");
                return;
            }
        }
        Iterator<T> it = labels.iterator();
        while (it.hasNext()) {
            get_identityModel().remove(it.next());
        }
    }

    @Override // P5.a
    public void removeEmail(String email) {
        kotlin.jvm.internal.h.e(email, "email");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "removeEmail(email: " + email + ')');
        if (com.onesignal.common.h.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.removeEmailSubscription(email);
        } else {
            com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot remove invalid email address as subscription: ".concat(email));
        }
    }

    @Override // P5.a
    public void removeObserver(InterfaceC0439a observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }

    @Override // P5.a
    public void removeSms(String sms) {
        kotlin.jvm.internal.h.e(sms, "sms");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "removeSms(sms: " + sms + ')');
        if (com.onesignal.common.h.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.removeSmsSubscription(sms);
        } else {
            com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot remove invalid sms number as subscription: ".concat(sms));
        }
    }

    @Override // P5.a
    public void removeTag(String key) {
        kotlin.jvm.internal.h.e(key, "key");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "removeTag(key: " + key + ')');
        if (key.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot remove tag with empty key");
        } else {
            get_propertiesModel().getTags().remove((Object) key);
        }
    }

    @Override // P5.a
    public void removeTags(Collection<String> keys) {
        kotlin.jvm.internal.h.e(keys, "keys");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "removeTags(keys: " + keys + ')');
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() == 0) {
                com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Cannot remove tag with empty key");
                return;
            }
        }
        Iterator<T> it2 = keys.iterator();
        while (it2.hasNext()) {
            get_propertiesModel().getTags().remove(it2.next());
        }
    }

    @Override // P5.a
    public void setLanguage(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this._languageContext.setLanguage(value);
    }

    @Override // P5.a
    public void trackEvent(String name, Map<String, ? extends Object> map) {
        kotlin.jvm.internal.h.e(name, "name");
        if (com.onesignal.common.f.INSTANCE.isValidJsonObject(map)) {
            this._customEventController.sendCustomEvent(name, map);
        } else {
            com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Custom event properties are not JSON-serializable");
        }
    }
}
